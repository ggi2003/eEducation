package io.agora.education;

import android.app.Application;

import io.agora.base.LogManager;
import io.agora.base.PreferenceManager;
import io.agora.base.ToastManager;
import io.agora.sdk.manager.RtcManager;
import io.agora.sdk.manager.RtmManager;

public class EduApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PreferenceManager.init(this);
        ToastManager.init(this);
        LogManager.setTagPre("education_");

        RtcManager.instance().init(this, getString(R.string.agora_app_id));
        RtmManager.instance().init(this, getString(R.string.agora_app_id));
    }

}
