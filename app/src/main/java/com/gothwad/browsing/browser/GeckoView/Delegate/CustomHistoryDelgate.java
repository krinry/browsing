package com.gothwad.browsing.browser.GeckoView.Delegate;

import androidx.annotation.NonNull;

import com.gothwad.browsing.browser.BrowserActivity;

import org.mozilla.geckoview.GeckoSession;

public class CustomHistoryDelgate implements GeckoSession.HistoryDelegate {
    public HistoryList historyList = null;

    public CustomHistoryDelgate(BrowserActivity ignoredActivity) {
        super();
    }
    @Override
    public void onHistoryStateChange(@NonNull GeckoSession session, @NonNull HistoryList historyList) {
        GeckoSession.HistoryDelegate.super.onHistoryStateChange(session, historyList);
        this.historyList = historyList;
    }
}