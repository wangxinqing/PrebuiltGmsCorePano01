package com.google.android.chimera;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.google.android.chimera.ActivityBase;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Activity extends ActivityBase {
    public static final int DEFAULT_KEYS_DIALER = 1;
    public static final int DEFAULT_KEYS_DISABLE = 0;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
    public static final int DEFAULT_KEYS_SHORTCUT = 2;
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_FIRST_USER = 1;
    public static final int RESULT_OK = -1;
    private gl CJ;
    private ProxyCallbacks CQ;
    private FragmentManager CR;
    private LoaderManager CS;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks extends ActivityBase.ProxyCallbacks {
        Activity getModuleActivity();

        Object superGetLastCustomNonConfigurationInstance();

        hl superGetSupportFragmentManager();

        is superGetSupportLoaderManager();

        void superOnAttachFragment(gj gjVar);

        boolean superOnPrepareOptionsPanel(View view, Menu menu);

        void superOnResumeFragments();

        Object superOnRetainCustomNonConfigurationInstance();

        void superStartActivityFromFragment(gj gjVar, Intent intent, int i);

        void superSupportFinishAfterTransition();

        void superSupportInvalidateOptionsMenu();

        void superSupportPostponeEnterTransition();

        void superSupportStartPostponedEnterTransition();
    }

    public FragmentManager getFragmentManager() {
        return getSupportFragmentManager();
    }

    public Object getLastCustomNonConfigurationInstance() {
        return this.CQ.superGetLastCustomNonConfigurationInstance();
    }

    public LoaderManager getLoaderManager() {
        return getSupportLoaderManager();
    }

    public FragmentManager getSupportFragmentManager() {
        return this.CR;
    }

    public LoaderManager getSupportLoaderManager() {
        if (this.CS == null) {
            this.CS = LoaderManager.get(this.CQ.superGetSupportLoaderManager());
        }
        return this.CS;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onAttachFragment(Fragment fragment) {
        this.CQ.superOnAttachFragment(fragment.getSupportContainerFragment());
    }

    /* access modifiers changed from: protected */
    public void onChildTitleChanged(android.app.Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return super.onCreateDialog(i);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return this.CQ.superOnPrepareOptionsPanel(view, menu);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.CQ.superOnResumeFragments();
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return this.CQ.superOnRetainCustomNonConfigurationInstance();
    }

    public final Object onRetainNonConfigurationInstance() {
        return this.CJ.onRetainNonConfigurationInstance();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    public boolean publicOnPrepareOptionsPanel(View view, Menu menu) {
        return onPrepareOptionsPanel(view, menu);
    }

    public void publicOnResumeFragments() {
        onResumeFragments();
    }

    public void setProxy(gl glVar, Context context) {
        this.CJ = glVar;
        this.CQ = (ProxyCallbacks) glVar;
        super.setProxy(glVar, context);
        this.CR = FragmentManager.get(this.CQ.superGetSupportFragmentManager());
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        this.CQ.superStartActivityFromFragment(fragment.getSupportContainerFragment(), intent, i);
    }

    public void supportFinishAfterTransition() {
        this.CQ.superSupportFinishAfterTransition();
    }

    public void supportInvalidateOptionsMenu() {
        this.CQ.superSupportInvalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        this.CQ.superSupportPostponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        this.CQ.superSupportStartPostponedEnterTransition();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        return super.onCreateDialog(i, bundle);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
    }
}
