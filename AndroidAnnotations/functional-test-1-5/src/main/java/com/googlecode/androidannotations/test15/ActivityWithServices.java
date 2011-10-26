/**
 * Copyright (C) 2010-2011 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.androidannotations.test15;


import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.text.ClipboardManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.SystemService;

@EActivity
public class ActivityWithServices extends Activity {

    @SystemService
    WindowManager windowManager;

    @SystemService
    LayoutInflater layoutInflater;

    @SystemService
    ActivityManager activityManager;
    
    @SystemService
    PowerManager powerManager;
    
    @SystemService
    AlarmManager alarmManager;
    
    @SystemService
    NotificationManager notificationManager;
    
    @SystemService
    KeyguardManager keyguardManager;
    
    @SystemService
    LocationManager locationManager;
    
    @SystemService
    SearchManager searchManager;
    
    @SystemService
    Vibrator vibrator;
    
    @SystemService
    ConnectivityManager connectivityManager;
    
    @SystemService
    WifiManager wifiManager;
    
    @SystemService
    InputMethodManager inputMethodManager;
    
    @SystemService
    SensorManager sensorManager;
    
    @SystemService
    ClipboardManager clipboardManager;

    // TODO Test those for > 1.5 Android versions
    // UiModeManager uiModeManager;
    // DownloadManager downloadManager;

}
