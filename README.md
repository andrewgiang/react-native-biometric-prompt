
# react-native-biometric-prompt

## Getting started

`$ npm install react-native-biometric-prompt --save`

### Mostly automatic installation

`$ react-native link react-native-biometric-prompt`

### Manual installation


#### iOS (CURRENTLY NOT SUPPORTED)
<!-- 
1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-biometric-prompt` and add `RNBiometricPromptAndroid.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBiometricPromptAndroid.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)< -->

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.andrewgiang.biometric.RNBiometricPromptAndroidPackage;` to the imports at the top of the file
  - Add `new RNBiometricPromptAndroidPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-biometric-prompt'
  	project(':react-native-biometric-prompt').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-biometric-prompt/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-biometric-prompt')
  	```


## Usage
```javascript
import RNBiometricPromptAndroid from 'react-native-biometric-prompt';

// TODO: What to do with the module?
RNBiometricPromptAndroid;
```
  