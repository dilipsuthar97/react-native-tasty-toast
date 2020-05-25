<h1 align="center">
<b>react-native-tasty-toast</b>

🍞 Make your native android Toasts Tasty

Support us with a star 🌟

<p align="center">
  <a href="https://github.com/dilipsuthar97/react-native-tasty-toast/releases"><img src="https://img.shields.io/github/v/release/dilipsuthar97/react-native-tasty-toast?include_prereleases" /></a>
  <a href="https://www.npmjs.com/package/react-native-tasty-toast"><img src="https://img.shields.io/npm/v/react-native-tasty-toast" /></a>
  <a href="https://github.com/dilipsuthar97/react-native-tasty-toast#License"><img src="https://img.shields.io/github/license/dilipsuthar97/react-native-tasty-toast" /></a>
  <a href=""><img src="https://img.shields.io/badge/status-online-brightgreen.svg" /></a>
</p>
</h1>

This library is a wrapper aroung native [TastyToast](https://github.com/yadav-rahul/TastyToast) Android library

## 📸 Preview

![gif](https://github.com/dilipsuthar97/react-native-tasty-toast/blob/master/ss/success.gif)
![gif](https://github.com/dilipsuthar97/react-native-tasty-toast/blob/master/ss/warning.gif)
![gif](https://github.com/dilipsuthar97/react-native-tasty-toast/blob/master/ss/error.gif)
![gif](https://github.com/dilipsuthar97/react-native-tasty-toast/blob/master/ss/info.gif)
![gif](https://github.com/dilipsuthar97/react-native-tasty-toast/blob/master/ss/default.gif)
![gif](https://github.com/dilipsuthar97/react-native-tasty-toast/blob/master/ss/confusion.gif)

## 📖 Getting started

`$ npm install react-native-tasty-toast --save`

`$ yarn add react-native-tasty-toast`

### Linking (Mostly automatic installation)

#### ReactNative < 0.60

`$ react-native link react-native-tasty-toast`

## 💻 Usage

### Only for Android

```javascript
import TastyToast from 'react-native-tasty-toast';
```

```javascript
TastyToast.show({
	message: 'My Toast',
	length: TastyToast.LENGTH_LONG,
	type: TastyToast.SUCCESS,
});
```

```javascript
TastyToast.cancel();
```

## 💡 Props

| Key     | Type   | Default                 | Description                           |
| ------- | ------ | ----------------------- | ------------------------------------- |
| message | string | required                | The message to display                |
| length  | number | TastyToast.LENGTH_SHORT | How long to display message           |
| type    | number | TastyToast.DEFAULT      | Type of the toast you want to display |

Where `length` is:

1. TastyToast.LENGTH_SHORT
2. TastyToast.LENGTH_LONG

Where `type` is:

1. TastyToast.DEFAULT
2. TastyToast.SUCCESS
3. TastyToast.WARNING
4. TastyToast.ERROR
5. TastyToast.INFO
6. TastyToast.CONFUSING

## ✨ Credits

-  Android: [yadav-rahul/TastyToast](https://github.com/yadav-rahul/TastyToast)

## 💫 Where is this library used?

If you are using this library in one of your projects, add it in this list below. ✨

## 💪 Support Development

There are few ways you can do it:

-  Starring and sharing the projects you like 🚀
-  Please follow [dilipsuthar97](https://github.com/dilipsuthar97) on GitHub.

<a href="https://www.buymeacoffee.com/dilipsuthar97" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee ☕" style="height: auto !important;width: auto !important;" ></a>

Thanks! ❤️
<br/>
[dilipsuthar97.github.io](https://dilipsuthar97.github.io)
<br/>

## 📱 Social

[![Twitter](https://img.shields.io/twitter/follow/dilipsuthar97?label=Follow&style=social)](https://twitter.com/dilipsuthar97)
![GitHub](https://img.shields.io/github/followers/dilipsuthar97?label=Follow&style=social)

## 📜 License

```
Copyright 2020 Dilip Suthar (dilipsuthar97)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
