package com.android.settings.deviceinfo.firmwareversion;

import android.content.Context;
import android.os.SystemProperties;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class LighthouseCLORevisionPreferenceController extends BasePreferenceController {

    private static final String TAG = "LighthouseCLORevisionCtrl";

    private static final String KEY_CLO_REVISION = "ro.lighthouse.clo.revision";

    public LighthouseCLORevisionPreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public CharSequence getSummary() {
        return SystemProperties.get(KEY_CLO_REVISION,
                mContext.getString(R.string.device_info_default));
    }
}
