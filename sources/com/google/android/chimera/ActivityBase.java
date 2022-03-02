package com.google.android.chimera;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.Application;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ActivityBase extends ContextThemeWrapper implements bnu {
    private Activity CK;
    private ProxyCallbacks CT;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks {
        void superAddContentView(View view, ViewGroup.LayoutParams layoutParams);

        void superCloseContextMenu();

        void superCloseOptionsMenu();

        void superConvertFromTranslucent();

        boolean superConvertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions);

        PendingIntent superCreatePendingResult(int i, Intent intent, int i2);

        boolean superDispatchGenericMotionEvent(MotionEvent motionEvent);

        boolean superDispatchKeyEventChimera(KeyEvent keyEvent);

        boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent);

        boolean superDispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent);

        boolean superDispatchTouchEvent(MotionEvent motionEvent);

        boolean superDispatchTrackballEvent(MotionEvent motionEvent);

        void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        View superFindViewById(int i);

        void superFinish();

        void superFinishActivity(int i);

        void superFinishActivityFromChild(Activity activity, int i);

        void superFinishAffinity();

        void superFinishAfterTransition();

        void superFinishAndRemoveTask();

        void superFinishFromChild(Activity activity);

        ComponentName superGetCallingActivity();

        String superGetCallingPackage();

        int superGetChangingConfigurations();

        ComponentName superGetComponentName();

        Scene superGetContentScene();

        TransitionManager superGetContentTransitionManager();

        View superGetCurrentFocus();

        Intent superGetIntent();

        Object superGetLastNonConfigurationInstance();

        LayoutInflater superGetLayoutInflater();

        String superGetLocalClassName();

        MenuInflater superGetMenuInflater();

        Intent superGetParentActivityIntent();

        SharedPreferences superGetPreferences(int i);

        Uri superGetReferrer();

        int superGetRequestedOrientation();

        int superGetTaskId();

        VoiceInteractor superGetVoiceInteractor();

        Window superGetWindow();

        WindowManager superGetWindowManager();

        boolean superHasWindowFocus();

        void superInvalidateOptionsMenu();

        boolean superIsBackgroundVisibleBehind();

        boolean superIsChangingConfigurations();

        boolean superIsDestroyed();

        boolean superIsFinishing();

        boolean superIsImmersive();

        boolean superIsTaskRoot();

        boolean superIsVoiceInteraction();

        boolean superIsVoiceInteractionRoot();

        boolean superMoveTaskToBack(boolean z);

        boolean superNavigateUpTo(Intent intent);

        boolean superNavigateUpToFromChild(Activity activity, Intent intent);

        void superOnActionModeFinished(ActionMode actionMode);

        void superOnActionModeStarted(ActionMode actionMode);

        void superOnActivityReenter(int i, Intent intent);

        void superOnActivityResult(int i, int i2, Intent intent);

        void superOnAttachedToWindow();

        void superOnBackPressed();

        void superOnBackgroundVisibleBehindChanged(boolean z);

        void superOnChildTitleChanged(Activity activity, CharSequence charSequence);

        void superOnConfigurationChanged(Configuration configuration);

        void superOnContentChanged();

        boolean superOnContextItemSelected(MenuItem menuItem);

        void superOnContextMenuClosed(Menu menu);

        void superOnCreate(Bundle bundle);

        void superOnCreate(Bundle bundle, PersistableBundle persistableBundle);

        void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

        CharSequence superOnCreateDescription();

        Dialog superOnCreateDialog(int i);

        Dialog superOnCreateDialog(int i, Bundle bundle);

        void superOnCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder);

        boolean superOnCreateOptionsMenu(Menu menu);

        boolean superOnCreatePanelMenu(int i, Menu menu);

        View superOnCreatePanelView(int i);

        boolean superOnCreateThumbnail(Bitmap bitmap, Canvas canvas);

        View superOnCreateView(View view, String str, Context context, AttributeSet attributeSet);

        View superOnCreateView(String str, Context context, AttributeSet attributeSet);

        void superOnDestroy();

        void superOnDetachedFromWindow();

        void superOnEnterAnimationComplete();

        boolean superOnGenericMotionEvent(MotionEvent motionEvent);

        boolean superOnKeyDown(int i, KeyEvent keyEvent);

        boolean superOnKeyLongPress(int i, KeyEvent keyEvent);

        boolean superOnKeyMultiple(int i, int i2, KeyEvent keyEvent);

        boolean superOnKeyShortcut(int i, KeyEvent keyEvent);

        boolean superOnKeyUp(int i, KeyEvent keyEvent);

        void superOnLowMemory();

        boolean superOnMenuItemSelected(int i, MenuItem menuItem);

        boolean superOnMenuOpened(int i, Menu menu);

        boolean superOnNavigateUp();

        boolean superOnNavigateUpFromChild(Activity activity);

        void superOnNewIntent(Intent intent);

        boolean superOnOptionsItemSelected(MenuItem menuItem);

        void superOnOptionsMenuClosed(Menu menu);

        void superOnPanelClosed(int i, Menu menu);

        void superOnPause();

        void superOnPostCreate(Bundle bundle);

        void superOnPostCreate(Bundle bundle, PersistableBundle persistableBundle);

        void superOnPostResume();

        void superOnPrepareDialog(int i, Dialog dialog);

        void superOnPrepareDialog(int i, Dialog dialog, Bundle bundle);

        void superOnPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder);

        boolean superOnPrepareOptionsMenu(Menu menu);

        boolean superOnPreparePanel(int i, View view, Menu menu);

        void superOnProvideAssistContent(AssistContent assistContent);

        void superOnProvideAssistData(Bundle bundle);

        Uri superOnProvideReferrer();

        void superOnRequestPermissionsResult(int i, String[] strArr, int[] iArr);

        void superOnRestart();

        void superOnRestoreInstanceState(Bundle bundle);

        void superOnRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle);

        void superOnResume();

        void superOnSaveInstanceState(Bundle bundle);

        void superOnSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle);

        boolean superOnSearchRequested();

        boolean superOnSearchRequested(SearchEvent searchEvent);

        void superOnStart();

        void superOnStateNotSaved();

        void superOnStop();

        void superOnTitleChanged(CharSequence charSequence, int i);

        boolean superOnTouchEvent(MotionEvent motionEvent);

        boolean superOnTrackballEvent(MotionEvent motionEvent);

        void superOnTrimMemory(int i);

        void superOnUserInteraction();

        void superOnUserLeaveHint();

        void superOnVisibleBehindCanceled();

        void superOnWindowAttributesChanged(WindowManager.LayoutParams layoutParams);

        void superOnWindowFocusChanged(boolean z);

        void superOpenContextMenu(View view);

        void superOpenOptionsMenu();

        void superOverridePendingTransition(int i, int i2);

        void superPostponeEnterTransition();

        void superRecreate();

        void superRegisterForContextMenu(View view);

        boolean superReleaseInstance();

        void superReportFullyDrawn();

        boolean superRequestVisibleBehind(boolean z);

        void superSetContentTransitionManager(TransitionManager transitionManager);

        void superSetContentView(int i);

        void superSetContentView(View view);

        void superSetContentView(View view, ViewGroup.LayoutParams layoutParams);

        void superSetFinishOnTouchOutside(boolean z);

        void superSetImmersive(boolean z);

        void superSetIntent(Intent intent);

        void superSetRequestedOrientation(int i);

        void superSetTaskDescription(ActivityManager.TaskDescription taskDescription);

        void superSetTitle(int i);

        void superSetTitle(CharSequence charSequence);

        void superSetTitleColor(int i);

        void superSetVisible(boolean z);

        boolean superShouldShowRequestPermissionRationale(String str);

        boolean superShouldUpRecreateTask(Intent intent);

        boolean superShowAssist(Bundle bundle);

        void superShowLockTaskEscapeMessage();

        void superStartActivities(Intent[] intentArr);

        void superStartActivities(Intent[] intentArr, Bundle bundle);

        void superStartActivity(Intent intent);

        void superStartActivity(Intent intent, Bundle bundle);

        void superStartActivityForResult(Intent intent, int i);

        void superStartActivityForResult(Intent intent, int i, Bundle bundle);

        void superStartActivityFromChild(Activity activity, Intent intent, int i);

        void superStartActivityFromChild(Activity activity, Intent intent, int i, Bundle bundle);

        boolean superStartActivityIfNeeded(Intent intent, int i);

        boolean superStartActivityIfNeeded(Intent intent, int i, Bundle bundle);

        void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3);

        void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle);

        void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4);

        void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

        void superStartIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4);

        void superStartIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

        void superStartLockTask();

        void superStartManagingCursor(Cursor cursor);

        boolean superStartNextMatchingActivity(Intent intent);

        boolean superStartNextMatchingActivity(Intent intent, Bundle bundle);

        void superStartPostponedEnterTransition();

        void superStartSearch(String str, boolean z, Bundle bundle, boolean z2);

        void superStopLockTask();

        void superStopManagingCursor(Cursor cursor);

        void superTakeKeyEvents(boolean z);

        void superTriggerSearch(String str, Bundle bundle);

        void superUnregisterForContextMenu(View view);
    }

    public ActivityBase() {
        super((Context) null, (Resources.Theme) null);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.CT.superAddContentView(view, layoutParams);
    }

    public void closeContextMenu() {
        this.CT.superCloseContextMenu();
    }

    public void closeOptionsMenu() {
        this.CT.superCloseOptionsMenu();
    }

    public void convertFromTranslucent() {
        this.CT.superConvertFromTranslucent();
    }

    public boolean convertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions) {
        return this.CT.superConvertToTranslucent(translucentConversionListener, activityOptions);
    }

    public PendingIntent createPendingResult(int i, Intent intent, int i2) {
        return this.CT.superCreatePendingResult(i, intent, i2);
    }

    public final void dismissDialog(int i) {
        this.CK.dismissDialog(i);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.CT.superDispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.CT.superDispatchKeyEventChimera(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.CT.superDispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.CT.superDispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.CT.superDispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.CT.superDispatchTrackballEvent(motionEvent);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.CT.superDump(str, fileDescriptor, printWriter, strArr);
    }

    public View findViewById(int i) {
        return this.CT.superFindViewById(i);
    }

    public void finish() {
        this.CT.superFinish();
    }

    public void finishActivity(int i) {
        this.CT.superFinishActivity(i);
    }

    public void finishActivityFromChild(Activity activity, int i) {
        this.CT.superFinishActivityFromChild(activity, i);
    }

    public void finishAffinity() {
        this.CT.superFinishAffinity();
    }

    public void finishAfterTransition() {
        this.CT.superFinishAfterTransition();
    }

    public void finishAndRemoveTask() {
        this.CT.superFinishAndRemoveTask();
    }

    public void finishFromChild(Activity activity) {
        this.CT.superFinishFromChild(activity);
    }

    public final Application getApplication() {
        return this.CK.getApplication();
    }

    public Context getApplicationContext() {
        int i = Build.VERSION.SDK_INT;
        return super.getApplicationContext();
    }

    public ComponentName getCallingActivity() {
        return this.CT.superGetCallingActivity();
    }

    public String getCallingPackage() {
        return this.CT.superGetCallingPackage();
    }

    public int getChangingConfigurations() {
        return this.CT.superGetChangingConfigurations();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public ComponentName getComponentName() {
        return this.CT.superGetComponentName();
    }

    public Activity getContainerActivity() {
        return this.CK;
    }

    public Scene getContentScene() {
        return this.CT.superGetContentScene();
    }

    public TransitionManager getContentTransitionManager() {
        return this.CT.superGetContentTransitionManager();
    }

    public View getCurrentFocus() {
        return this.CT.superGetCurrentFocus();
    }

    public Intent getIntent() {
        return this.CT.superGetIntent();
    }

    public Object getLastNonConfigurationInstance() {
        return this.CT.superGetLastNonConfigurationInstance();
    }

    public LayoutInflater getLayoutInflater() {
        return this.CT.superGetLayoutInflater();
    }

    public String getLocalClassName() {
        return this.CT.superGetLocalClassName();
    }

    public final MediaController getMediaController() {
        return this.CK.getMediaController();
    }

    public MenuInflater getMenuInflater() {
        return this.CT.superGetMenuInflater();
    }

    public final Activity getParent() {
        return this.CK.getParent();
    }

    public Intent getParentActivityIntent() {
        return this.CT.superGetParentActivityIntent();
    }

    public SharedPreferences getPreferences(int i) {
        return this.CT.superGetPreferences(i);
    }

    public Uri getReferrer() {
        return this.CT.superGetReferrer();
    }

    public int getRequestedOrientation() {
        return this.CT.superGetRequestedOrientation();
    }

    public final SearchEvent getSearchEvent() {
        return this.CK.getSearchEvent();
    }

    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return this.CK.getSystemService(str);
        }
        return super.getSystemService(str);
    }

    public int getTaskId() {
        return this.CT.superGetTaskId();
    }

    public final CharSequence getTitle() {
        return this.CK.getTitle();
    }

    public final int getTitleColor() {
        return this.CK.getTitleColor();
    }

    public VoiceInteractor getVoiceInteractor() {
        return this.CT.superGetVoiceInteractor();
    }

    public final int getVolumeControlStream() {
        return this.CK.getVolumeControlStream();
    }

    public Window getWindow() {
        return this.CT.superGetWindow();
    }

    public WindowManager getWindowManager() {
        return this.CT.superGetWindowManager();
    }

    public boolean hasWindowFocus() {
        return this.CT.superHasWindowFocus();
    }

    public void invalidateOptionsMenu() {
        this.CT.superInvalidateOptionsMenu();
    }

    public boolean isBackgroundVisibleBehind() {
        return this.CT.superIsBackgroundVisibleBehind();
    }

    public boolean isChangingConfigurations() {
        return this.CT.superIsChangingConfigurations();
    }

    public final boolean isChild() {
        return this.CK.isChild();
    }

    public boolean isDestroyed() {
        return this.CT.superIsDestroyed();
    }

    public boolean isFinishing() {
        return this.CT.superIsFinishing();
    }

    public boolean isImmersive() {
        return this.CT.superIsImmersive();
    }

    public boolean isTaskRoot() {
        return this.CT.superIsTaskRoot();
    }

    public boolean isVoiceInteraction() {
        return this.CT.superIsVoiceInteraction();
    }

    public boolean isVoiceInteractionRoot() {
        return this.CT.superIsVoiceInteractionRoot();
    }

    public final Cursor managedQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.CK.managedQuery(uri, strArr, str, strArr2, str2);
    }

    public boolean moveTaskToBack(boolean z) {
        return this.CT.superMoveTaskToBack(z);
    }

    public boolean navigateUpTo(Intent intent) {
        return this.CT.superNavigateUpTo(intent);
    }

    public boolean navigateUpToFromChild(Activity activity, Intent intent) {
        return this.CT.superNavigateUpToFromChild(activity, intent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.CT.superOnActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.CT.superOnActionModeStarted(actionMode);
    }

    public void onActivityReenter(int i, Intent intent) {
        this.CT.superOnActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.CT.superOnActivityResult(i, i2, intent);
    }

    public void onAttachedToWindow() {
        this.CT.superOnAttachedToWindow();
    }

    public void onBackPressed() {
        this.CT.superOnBackPressed();
    }

    public void onBackgroundVisibleBehindChanged(boolean z) {
        this.CT.superOnBackgroundVisibleBehindChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onChildTitleChanged(Activity activity, CharSequence charSequence) {
        this.CT.superOnChildTitleChanged(activity, charSequence);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.CT.superOnConfigurationChanged(configuration);
    }

    public void onContentChanged() {
        this.CT.superOnContentChanged();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.CT.superOnContextItemSelected(menuItem);
    }

    public void onContextMenuClosed(Menu menu) {
        this.CT.superOnContextMenuClosed(menu);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.CT.superOnCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.CT.superOnCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public CharSequence onCreateDescription() {
        return this.CT.superOnCreateDescription();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return this.CT.superOnCreateDialog(i);
    }

    public void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        this.CT.superOnCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.CT.superOnCreateOptionsMenu(menu);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.CT.superOnCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.CT.superOnCreatePanelView(i);
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return this.CT.superOnCreateThumbnail(bitmap, canvas);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.CT.superOnCreateView(view, str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.CT.superOnDestroy();
    }

    public void onDetachedFromWindow() {
        this.CT.superOnDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        this.CT.superOnEnterAnimationComplete();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return this.CT.superOnGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.CT.superOnKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.CT.superOnKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.CT.superOnKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return this.CT.superOnKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.CT.superOnKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        this.CT.superOnLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.CT.superOnMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.CT.superOnMenuOpened(i, menu);
    }

    public boolean onNavigateUp() {
        return this.CT.superOnNavigateUp();
    }

    public boolean onNavigateUpFromChild(Activity activity) {
        return this.CT.superOnNavigateUpFromChild(activity);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.CT.superOnNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.CT.superOnOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        this.CT.superOnOptionsMenuClosed(menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.CT.superOnPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.CT.superOnPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        this.CT.superOnPostCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        this.CT.superOnPostResume();
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        this.CT.superOnPrepareDialog(i, dialog);
    }

    public void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        this.CT.superOnPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.CT.superOnPrepareOptionsMenu(menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.CT.superOnPreparePanel(i, view, menu);
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        this.CT.superOnProvideAssistContent(assistContent);
    }

    public void onProvideAssistData(Bundle bundle) {
        this.CT.superOnProvideAssistData(bundle);
    }

    public Uri onProvideReferrer() {
        return this.CT.superOnProvideReferrer();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.CT.superOnRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        this.CT.superOnRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        this.CT.superOnRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.CT.superOnResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.CT.superOnSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        return this.CT.superOnSearchRequested();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.CT.superOnStart();
    }

    public void onStateNotSaved() {
        this.CT.superOnStateNotSaved();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.CT.superOnStop();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        this.CT.superOnTitleChanged(charSequence, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.CT.superOnTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return this.CT.superOnTrackballEvent(motionEvent);
    }

    public void onTrimMemory(int i) {
        this.CT.superOnTrimMemory(i);
    }

    public void onUserInteraction() {
        this.CT.superOnUserInteraction();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        this.CT.superOnUserLeaveHint();
    }

    public void onVisibleBehindCanceled() {
        this.CT.superOnVisibleBehindCanceled();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.CT.superOnWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.CT.superOnWindowFocusChanged(z);
    }

    public void openContextMenu(View view) {
        this.CT.superOpenContextMenu(view);
    }

    public void openOptionsMenu() {
        this.CT.superOpenOptionsMenu();
    }

    public void overridePendingTransition(int i, int i2) {
        this.CT.superOverridePendingTransition(i, i2);
    }

    public void postponeEnterTransition() {
        this.CT.superPostponeEnterTransition();
    }

    public void publicOnActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public void publicOnChildTitleChanged(Activity activity, CharSequence charSequence) {
        onChildTitleChanged(activity, charSequence);
    }

    public void publicOnCreate(Bundle bundle) {
        onCreate(bundle);
    }

    public Dialog publicOnCreateDialog(int i) {
        return onCreateDialog(i);
    }

    public void publicOnDestroy() {
        onDestroy();
    }

    public void publicOnNewIntent(Intent intent) {
        onNewIntent(intent);
    }

    public void publicOnPause() {
        onPause();
    }

    public void publicOnPostCreate(Bundle bundle) {
        onPostCreate(bundle);
    }

    public void publicOnPostResume() {
        onPostResume();
    }

    public void publicOnPrepareDialog(int i, Dialog dialog) {
        onPrepareDialog(i, dialog);
    }

    public void publicOnRestart() {
        onRestart();
    }

    public void publicOnRestoreInstanceState(Bundle bundle) {
        onRestoreInstanceState(bundle);
    }

    public void publicOnResume() {
        onResume();
    }

    public void publicOnSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void publicOnStart() {
        onStart();
    }

    public void publicOnStop() {
        onStop();
    }

    public void publicOnTitleChanged(CharSequence charSequence, int i) {
        onTitleChanged(charSequence, i);
    }

    public void publicOnUserLeaveHint() {
        onUserLeaveHint();
    }

    public void recreate() {
        this.CT.superRecreate();
    }

    public void registerForContextMenu(View view) {
        this.CT.superRegisterForContextMenu(view);
    }

    public boolean releaseInstance() {
        return this.CT.superReleaseInstance();
    }

    public final void removeDialog(int i) {
        this.CK.removeDialog(i);
    }

    public void reportFullyDrawn() {
        this.CT.superReportFullyDrawn();
    }

    public final void requestPermissions(String[] strArr, int i) {
        this.CK.requestPermissions(strArr, i);
    }

    public boolean requestVisibleBehind(boolean z) {
        return this.CT.superRequestVisibleBehind(z);
    }

    public final boolean requestWindowFeature(int i) {
        return this.CK.requestWindowFeature(i);
    }

    public final void runOnUiThread(Runnable runnable) {
        this.CK.runOnUiThread(runnable);
    }

    public void setContentTransitionManager(TransitionManager transitionManager) {
        this.CT.superSetContentTransitionManager(transitionManager);
    }

    public void setContentView(int i) {
        this.CT.superSetContentView(i);
    }

    public final void setDefaultKeyMode(int i) {
        this.CK.setDefaultKeyMode(i);
    }

    public final void setFeatureDrawable(int i, Drawable drawable) {
        this.CK.setFeatureDrawable(i, drawable);
    }

    public final void setFeatureDrawableAlpha(int i, int i2) {
        this.CK.setFeatureDrawableAlpha(i, i2);
    }

    public final void setFeatureDrawableResource(int i, int i2) {
        this.CK.setFeatureDrawableResource(i, i2);
    }

    public final void setFeatureDrawableUri(int i, Uri uri) {
        this.CK.setFeatureDrawableUri(i, uri);
    }

    public void setFinishOnTouchOutside(boolean z) {
        this.CT.superSetFinishOnTouchOutside(z);
    }

    public void setImmersive(boolean z) {
        this.CT.superSetImmersive(z);
    }

    public void setIntent(Intent intent) {
        this.CT.superSetIntent(intent);
    }

    public final void setMediaController(MediaController mediaController) {
        this.CK.setMediaController(mediaController);
    }

    public final void setProgress(int i) {
        this.CK.setProgress(i);
    }

    public final void setProgressBarIndeterminate(boolean z) {
        this.CK.setProgressBarIndeterminate(z);
    }

    public final void setProgressBarIndeterminateVisibility(boolean z) {
        this.CK.setProgressBarIndeterminateVisibility(z);
    }

    public final void setProgressBarVisibility(boolean z) {
        this.CK.setProgressBarVisibility(z);
    }

    public void setProxy(Activity activity, Context context) {
        this.CK = activity;
        this.CT = (ProxyCallbacks) activity;
        attachBaseContext(context);
    }

    public void setRequestedOrientation(int i) {
        this.CT.superSetRequestedOrientation(i);
    }

    public final void setResult(int i) {
        this.CK.setResult(i);
    }

    public final void setSecondaryProgress(int i) {
        this.CK.setSecondaryProgress(i);
    }

    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        this.CT.superSetTaskDescription(taskDescription);
    }

    public void setTitle(int i) {
        this.CT.superSetTitle(i);
    }

    public void setTitleColor(int i) {
        this.CT.superSetTitleColor(i);
    }

    public void setVisible(boolean z) {
        this.CT.superSetVisible(z);
    }

    public final void setVolumeControlStream(int i) {
        this.CK.setVolumeControlStream(i);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return this.CT.superShouldShowRequestPermissionRationale(str);
    }

    public boolean shouldUpRecreateTask(Intent intent) {
        return this.CT.superShouldUpRecreateTask(intent);
    }

    public boolean showAssist(Bundle bundle) {
        return this.CT.superShowAssist(bundle);
    }

    public final void showDialog(int i) {
        this.CK.showDialog(i);
    }

    public void showLockTaskEscapeMessage() {
        this.CT.superShowLockTaskEscapeMessage();
    }

    public void startActivities(Intent[] intentArr) {
        this.CT.superStartActivities(intentArr);
    }

    public void startActivity(Intent intent) {
        this.CT.superStartActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.CT.superStartActivityForResult(intent, i);
    }

    public void startActivityFromChild(Activity activity, Intent intent, int i) {
        this.CT.superStartActivityFromChild(activity, intent, i);
    }

    public boolean startActivityIfNeeded(Intent intent, int i) {
        return this.CT.superStartActivityIfNeeded(intent, i);
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        this.CT.superStartIntentSender(intentSender, intent, i, i2, i3);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.CT.superStartIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.CT.superStartIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public void startLockTask() {
        this.CT.superStartLockTask();
    }

    public void startManagingCursor(Cursor cursor) {
        this.CT.superStartManagingCursor(cursor);
    }

    public boolean startNextMatchingActivity(Intent intent) {
        return this.CT.superStartNextMatchingActivity(intent);
    }

    public void startPostponedEnterTransition() {
        this.CT.superStartPostponedEnterTransition();
    }

    public void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        this.CT.superStartSearch(str, z, bundle, z2);
    }

    public void stopLockTask() {
        this.CT.superStopLockTask();
    }

    public void stopManagingCursor(Cursor cursor) {
        this.CT.superStopManagingCursor(cursor);
    }

    public void takeKeyEvents(boolean z) {
        this.CT.superTakeKeyEvents(z);
    }

    public void triggerSearch(String str, Bundle bundle) {
        this.CT.superTriggerSearch(str, bundle);
    }

    public void unregisterForContextMenu(View view) {
        this.CT.superUnregisterForContextMenu(view);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        this.CT.superOnCreate(bundle, persistableBundle);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        return this.CT.superOnCreateDialog(i, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.CT.superOnCreateView(str, context, attributeSet);
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        this.CT.superOnPostCreate(bundle, persistableBundle);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        this.CT.superOnPrepareDialog(i, dialog, bundle);
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        this.CT.superOnRestoreInstanceState(bundle, persistableBundle);
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        this.CT.superOnSaveInstanceState(bundle, persistableBundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.CT.superOnSearchRequested(searchEvent);
    }

    public Dialog publicOnCreateDialog(int i, Bundle bundle) {
        return onCreateDialog(i, bundle);
    }

    public void publicOnPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        onPrepareDialog(i, dialog, bundle);
    }

    public void setContentView(View view) {
        this.CT.superSetContentView(view);
    }

    public final void setResult(int i, Intent intent) {
        this.CK.setResult(i, intent);
    }

    public void setTitle(CharSequence charSequence) {
        this.CT.superSetTitle(charSequence);
    }

    public final boolean showDialog(int i, Bundle bundle) {
        return this.CK.showDialog(i, bundle);
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        this.CT.superStartActivities(intentArr, bundle);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.CT.superStartActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.CT.superStartActivityForResult(intent, i, bundle);
    }

    public void startActivityFromChild(Activity activity, Intent intent, int i, Bundle bundle) {
        this.CT.superStartActivityFromChild(activity, intent, i, bundle);
    }

    public boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return this.CT.superStartActivityIfNeeded(intent, i, bundle);
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        this.CT.superStartIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.CT.superStartIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.CT.superStartIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        return this.CT.superStartNextMatchingActivity(intent, bundle);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.CT.superSetContentView(view, layoutParams);
    }
}
