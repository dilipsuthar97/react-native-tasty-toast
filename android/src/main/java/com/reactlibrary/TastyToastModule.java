package com.reactlibrary;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.sdsmdg.tastytoast.TastyToast;

import java.util.HashMap;
import java.util.Map;

public class TastyToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Toast toast;
    private static final String RN_CLASS = "RNTastyToast";


    public TastyToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    // Module name in javascript to expose
    @NonNull
    @Override
    public String getName() {
        return RN_CLASS;
    }

    // Constants in javascript to expose
    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("LENGTH_SHORT", TastyToast.LENGTH_SHORT);
        constants.put("LENGTH_LONG", TastyToast.LENGTH_LONG);

        constants.put("DEFAULT", TastyToast.DEFAULT);
        constants.put("SUCCESS", TastyToast.SUCCESS);
        constants.put("WARNING", TastyToast.WARNING);
        constants.put("ERROR", TastyToast.ERROR);
        constants.put("INFO", TastyToast.INFO);
        constants.put("CONFUSING", TastyToast.CONFUSING);

        return constants;
    }

    @ReactMethod
    public void showToast(ReadableMap options) {
        String message = getOptionValue(options, "message", "");
        int length = getOptionValue(options, "length", TastyToast.LENGTH_SHORT);
        int type = getOptionValue(options, "type", TastyToast.DEFAULT);

        toast = TastyToast.makeText(reactContext, message, length, type);
    }

    @ReactMethod
    public void cancel() {
        if (toast != null) {
            toast.cancel();
        }
    }

    private String getOptionValue(ReadableMap options, String key, String fallback) {
        return options.hasKey(key) ? options.getString(key) : fallback;
    }
    private int getOptionValue(ReadableMap options, String key, int fallback) {
        return options.hasKey(key) ? options.getInt(key) : fallback;
    }
    private boolean getOptionValue(ReadableMap options, String key, boolean fallback) {
        return options.hasKey(key) ? options.getBoolean(key) : fallback;
    }
}
