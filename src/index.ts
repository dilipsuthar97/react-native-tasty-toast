import { NativeModules } from 'react-native';

const { RNTastyToast } = NativeModules;

interface Options {
	message: string;
	length?: number;
	type?: number;
}

const TastyToast = {
	LENGTH_SHORT: RNTastyToast.LENGTH_SHORT,
	LENGTH_LONG: RNTastyToast.LENGTH_LONG,
	DEFAULT: RNTastyToast.DEFAULT,
	SUCCESS: RNTastyToast.SUCCESS,
	WARNING: RNTastyToast.WARNING,
	ERROR: RNTastyToast.ERROR,
	INFO: RNTastyToast.INFO,
	CONFUSING: RNTastyToast.CONFUSING,
	show: (options: Options) => RNTastyToast.showToast(options),
	cancel: () => RNTastyToast.cancel(),
};

export default TastyToast;
