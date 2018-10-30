/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react';
import { StyleSheet, View, Button, Alert } from 'react-native';
import BiometricPrompt from 'react-native-biometric-prompt'


export default class App extends Component {

    onPress() {
        const promptConfig = {
            description: 'Description',
            subtitle: 'subtitle',
        };
        BiometricPrompt.authenticate('Prompt Title', promptConfig,
            (error, errStr) => {
                Alert.alert(error + ":" + errStr);
            },
            (success) => {
                Alert.alert(success);
            })
    }

    render() {
        return (
            <View style={styles.container}>
                <Button title={"Fingerprint Scanner"} onPress={() => this.onPress()} />
            </View>
        );
    }
}

const styles = StyleSheet.create({

    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    }
});
