package com.gothwad.browsing.updater;

import android.app.Activity;
import android.os.Build;

import com.gothwad.browsing.helper.DataStoreEditor;

public class BrowserUpdater extends AppUpdater {
    public static final String GIT_REPO_BROWSER = "gothwadtech/LightningBrowser";

    // URL Constants
    @Override
    protected String getAppDownloadName() {
        // Name of apk on github, not including ".apk"
        return  (Build.SUPPORTED_64_BIT_ABIS.length > 0)
                ? "GothwadBrowsing_Arm64" : "GothwadBrowsing";
    }

    @Override
    protected String getAppPackageName() {
        return "com.gothwad.browsing";
    }

    @Override
    protected String getAppDisplayName() {
        return "Gothwad Browsing";
    }

    @Override
    protected String getGitRepo() {
        return GIT_REPO_BROWSER;
    }
    private static final String KEY_IGNORED_UPDATE_TAG = "IGNORED_UPDATE_TAG";
    @Override
    protected void putIgnoredUpdateTag(String ignoredUpdateTag) {
        new DataStoreEditor(activity).putString(KEY_IGNORED_UPDATE_TAG, ignoredUpdateTag);
    }
    @Override
    protected String getIgnoredUpdateTag() {
        return new DataStoreEditor(activity).getString(KEY_IGNORED_UPDATE_TAG, "");
    }

    public BrowserUpdater(Activity activity) {
        super(activity);
    }
}
