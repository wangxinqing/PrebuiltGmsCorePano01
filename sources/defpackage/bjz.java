package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Log;
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
import com.google.android.chimera.Activity;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.chimera.util.ChimeraResource;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bjz extends gl implements Activity.ProxyCallbacks, bou {
    public static final bjy p = new bjy();
    public ClassLoader k;
    public ClassLoader l;
    public ClassLoader m;
    public String n = null;
    public boolean o = false;
    private boolean q = false;
    private Activity r = null;
    private LayoutInflater s = null;

    public final Bundle a(Bundle bundle) {
        Activity f = f();
        ClassLoader classLoader = this.k;
        ClassLoader classLoader2 = this.l;
        if (bundle == null) {
            return null;
        }
        try {
            ModuleManager.ModuleApkInfo currentModuleApk = ModuleManager.get(f).getCurrentModuleApk();
            int i = bundle.getInt("_chimera_module_apk_type");
            long j = bundle.getLong("_chimera_module_apk_timestamp");
            int i2 = currentModuleApk.apkType;
            long j2 = currentModuleApk.apkTimestamp;
            if (i == i2 && j == j2) {
                Bundle bundle2 = bundle.getBundle("_chimera_module_state");
                if (bundle2 == null) {
                    return bundle;
                }
                if (!classLoader2.equals(classLoader)) {
                    bundle2.setClassLoader(classLoader2);
                    if (!bundle2.getBoolean("_chimera_saved_state_processed_flag", false)) {
                        jt.a(bundle2, classLoader2, classLoader);
                        bundle2.putBoolean("_chimera_saved_state_processed_flag", true);
                        return bundle2;
                    }
                }
                return bundle2;
            }
            Log.w("SavedInstanceUtils", "Module has changed since the Activity's state was saved. Dropping previously saved state.");
            return null;
        } catch (IllegalStateException e) {
            return bundle;
        }
    }

    public /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        throw null;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().addContentView(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.q = true;
        try {
            super.attachBaseContext(context);
            if (!e()) {
                a(g(), boo.a().a((Context) this));
            }
        } catch (PackageManager.NameNotFoundException | bop | InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to load fallback Activity:");
            sb.append(valueOf);
            Log.e("ChimeraActivityProxy", sb.toString());
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
        this.q = false;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.l);
        }
    }

    public final void c() {
        f().supportInvalidateOptionsMenu();
    }

    public final void closeContextMenu() {
        f().closeContextMenu();
    }

    public final void closeOptionsMenu() {
        f().closeOptionsMenu();
    }

    public final void convertFromTranslucent() {
        f().convertFromTranslucent();
    }

    public final boolean convertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions) {
        return f().convertToTranslucent(translucentConversionListener, activityOptions);
    }

    public final PendingIntent createPendingResult(int i, Intent intent, int i2) {
        return f().createPendingResult(i, intent, i2);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return f().dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f().dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return f().dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return f().dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return f().dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return f().dispatchTrackballEvent(motionEvent);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        f().dump(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        throw null;
    }

    public final com.google.android.chimera.Activity f() {
        amtf.a((Object) this.r, "Activity impl has not been set!", new Object[0]);
        return this.r;
    }

    public final View findViewById(int i) {
        return f().findViewById(i);
    }

    public final void finish() {
        f().finish();
    }

    public final void finishActivity(int i) {
        f().finishActivity(i);
    }

    public final void finishActivityFromChild(android.app.Activity activity, int i) {
        f().finishActivityFromChild(activity, i);
    }

    public final void finishAffinity() {
        f().finishAffinity();
    }

    public final void finishAfterTransition() {
        f().finishAfterTransition();
    }

    public final void finishAndRemoveTask() {
        f().finishAndRemoveTask();
    }

    public final void finishFromChild(android.app.Activity activity) {
        f().finishFromChild(activity);
    }

    /* access modifiers changed from: protected */
    public com.google.android.chimera.Activity g() {
        return new boa();
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final ComponentName getCallingActivity() {
        return f().getCallingActivity();
    }

    public final String getCallingPackage() {
        return f().getCallingPackage();
    }

    public final int getChangingConfigurations() {
        return f().getChangingConfigurations();
    }

    public final ClassLoader getClassLoader() {
        return !this.q ? this.m : super.getClassLoader();
    }

    public final ComponentName getComponentName() {
        return f().getComponentName();
    }

    public final Scene getContentScene() {
        return f().getContentScene();
    }

    public final TransitionManager getContentTransitionManager() {
        return f().getContentTransitionManager();
    }

    public final View getCurrentFocus() {
        return f().getCurrentFocus();
    }

    public final Intent getIntent() {
        return f().getIntent();
    }

    public final Object getLastNonConfigurationInstance() {
        return f().getLastNonConfigurationInstance();
    }

    public final LayoutInflater getLayoutInflater() {
        return f().getLayoutInflater();
    }

    public final String getLocalClassName() {
        return f().getLocalClassName();
    }

    public final MenuInflater getMenuInflater() {
        return f().getMenuInflater();
    }

    public final com.google.android.chimera.Activity getModuleActivity() {
        return f();
    }

    public final Intent getParentActivityIntent() {
        return f().getParentActivityIntent();
    }

    public final SharedPreferences getPreferences(int i) {
        return f().getPreferences(i);
    }

    public final Uri getReferrer() {
        return f().getReferrer();
    }

    public final int getRequestedOrientation() {
        return f().getRequestedOrientation();
    }

    public final Resources getResources() {
        if (!this.q) {
            return f().getResources();
        }
        return super.getResources();
    }

    public final Object getSystemService(String str) {
        if (this.q || !"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.s == null) {
            this.s = ((LayoutInflater) super.getSystemService(str)).cloneInContext(f());
        }
        return this.s;
    }

    public final int getTaskId() {
        return f().getTaskId();
    }

    public final Resources.Theme getTheme() {
        if (!this.q) {
            return f().getTheme();
        }
        return super.getTheme();
    }

    public final VoiceInteractor getVoiceInteractor() {
        return f().getVoiceInteractor();
    }

    public final Window getWindow() {
        return f().getWindow();
    }

    public final WindowManager getWindowManager() {
        return f().getWindowManager();
    }

    public final boolean hasWindowFocus() {
        return f().hasWindowFocus();
    }

    public final void invalidateOptionsMenu() {
        f().invalidateOptionsMenu();
    }

    public final boolean isBackgroundVisibleBehind() {
        return f().isBackgroundVisibleBehind();
    }

    public final boolean isChangingConfigurations() {
        return f().isChangingConfigurations();
    }

    public final boolean isDestroyed() {
        return f().isDestroyed();
    }

    public final boolean isFinishing() {
        return f().isFinishing();
    }

    public final boolean isImmersive() {
        return f().isImmersive();
    }

    public final boolean isTaskRoot() {
        return f().isTaskRoot();
    }

    public final boolean isVoiceInteraction() {
        return f().isVoiceInteraction();
    }

    public final boolean isVoiceInteractionRoot() {
        return f().isVoiceInteractionRoot();
    }

    public final boolean moveTaskToBack(boolean z) {
        return f().moveTaskToBack(z);
    }

    public final boolean navigateUpTo(Intent intent) {
        return f().navigateUpTo(intent);
    }

    public final boolean navigateUpToFromChild(android.app.Activity activity, Intent intent) {
        return f().navigateUpToFromChild(activity, intent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        f().onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        f().onActionModeStarted(actionMode);
    }

    public final void onActivityReenter(int i, Intent intent) {
        com.google.android.chimera.Activity f = f();
        a(intent);
        f.onActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        com.google.android.chimera.Activity f = f();
        if (intent != null) {
            a(intent);
            if (intent.hasExtra("_chimera_fallback_only") && !(f instanceof boa)) {
                return;
            }
        }
        f.publicOnActivityResult(i, i2, intent);
    }

    public final void onAttachFragment(Fragment fragment) {
        String tag = fragment.getTag();
        if (tag != null && tag.contains("report_fragment_tag")) {
            this.n = fragment.getClass().getName();
        }
        super.onAttachFragment(fragment);
    }

    public void onAttachedToWindow() {
        f().onAttachedToWindow();
    }

    public void onBackPressed() {
        f().onBackPressed();
    }

    public final void onBackgroundVisibleBehindChanged(boolean z) {
        f().onBackgroundVisibleBehindChanged(z);
    }

    /* access modifiers changed from: protected */
    public final void onChildTitleChanged(android.app.Activity activity, CharSequence charSequence) {
        f().publicOnChildTitleChanged(activity, charSequence);
    }

    public void onConfigurationChanged(Configuration configuration) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(f().getApplicationContext());
        if (moduleContext != null) {
            moduleContext.updateModuleConfiguration(configuration);
        }
        f().onConfigurationChanged(configuration);
    }

    public void onContentChanged() {
        f().onContentChanged();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return f().onContextItemSelected(menuItem);
    }

    public void onContextMenuClosed(Menu menu) {
        f().onContextMenuClosed(menu);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.o = bundle.getBoolean("_chimera_attempt_ftr_req", false);
            if (this.l != this.k) {
                String string = bundle.getString("_chimera_rpt_frg_cls");
                this.n = string;
                if (string != null) {
                    this.m = new bof(this.k, this.l, true, new String[]{string});
                }
            }
        }
        f().publicOnCreate(a(bundle));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        f().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public CharSequence onCreateDescription() {
        return f().onCreateDescription();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return f().publicOnCreateDialog(i);
    }

    public void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        f().onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return f().onCreateOptionsMenu(menu);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return f().onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return f().onCreatePanelView(i);
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return f().onCreateThumbnail(bitmap, canvas);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f().onCreateView(view, str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        f().publicOnDestroy();
    }

    public void onDetachedFromWindow() {
        f().onDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        f().onEnterAnimationComplete();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return f().onGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return f().onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return f().onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return f().onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return f().onKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return f().onKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        f().onLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return f().onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return f().onMenuOpened(i, menu);
    }

    public boolean onNavigateUp() {
        return f().onNavigateUp();
    }

    public boolean onNavigateUpFromChild(android.app.Activity activity) {
        return f().onNavigateUpFromChild(activity);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        com.google.android.chimera.Activity f = f();
        a(intent);
        f.publicOnNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return f().onOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        f().onOptionsMenuClosed(menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        f().onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        f().publicOnPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        f().publicOnPostCreate(a(bundle));
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        f().publicOnPostResume();
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        f().publicOnPrepareDialog(i, dialog);
    }

    public void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        f().onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return f().onPrepareOptionsMenu(menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return f().onPreparePanel(i, view, menu);
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        f().onProvideAssistContent(assistContent);
    }

    public void onProvideAssistData(Bundle bundle) {
        f().onProvideAssistData(bundle);
    }

    public final Uri onProvideReferrer() {
        return f().onProvideReferrer();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f().onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        f().publicOnRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        Bundle a = a(bundle);
        if (a == null) {
            super.onRestoreInstanceState(new Bundle());
        } else {
            f().publicOnRestoreInstanceState(a);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        f().publicOnResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        f().publicOnSaveInstanceState(bundle2);
        if (bundle != null) {
            a(bundle, bundle2);
            bundle.putString("_chimera_rpt_frg_cls", this.n);
            bundle.putBoolean("_chimera_attempt_ftr_req", this.o);
        }
    }

    public boolean onSearchRequested() {
        return f().onSearchRequested();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        f().publicOnStart();
    }

    public void onStateNotSaved() {
        f().onStateNotSaved();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        f().publicOnStop();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        f().publicOnTitleChanged(charSequence, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f().onTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return f().onTrackballEvent(motionEvent);
    }

    public void onTrimMemory(int i) {
        f().onTrimMemory(i);
    }

    public void onUserInteraction() {
        f().onUserInteraction();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        f().publicOnUserLeaveHint();
    }

    public final void onVisibleBehindCanceled() {
        f().onVisibleBehindCanceled();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        f().onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        f().onWindowFocusChanged(z);
    }

    public final void openContextMenu(View view) {
        f().openContextMenu(view);
    }

    public final void openOptionsMenu() {
        f().openOptionsMenu();
    }

    public final void overridePendingTransition(int i, int i2) {
        f().overridePendingTransition(i, i2);
    }

    public final void postponeEnterTransition() {
        f().postponeEnterTransition();
    }

    public final void recreate() {
        f().recreate();
    }

    public final void registerForContextMenu(View view) {
        f().registerForContextMenu(view);
    }

    public final boolean releaseInstance() {
        return f().releaseInstance();
    }

    public final void reportFullyDrawn() {
        f().reportFullyDrawn();
    }

    public final boolean requestVisibleBehind(boolean z) {
        return f().requestVisibleBehind(z);
    }

    public final void setContentTransitionManager(TransitionManager transitionManager) {
        f().setContentTransitionManager(transitionManager);
    }

    public final void setContentView(int i) {
        f().setContentView(i);
    }

    public final void setFinishOnTouchOutside(boolean z) {
        f().setFinishOnTouchOutside(z);
    }

    public final void setImmersive(boolean z) {
        f().setImmersive(z);
    }

    public final void setIntent(Intent intent) {
        f().setIntent(intent);
    }

    public final void setRequestedOrientation(int i) {
        f().setRequestedOrientation(i);
    }

    public final void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        f().setTaskDescription(taskDescription);
    }

    public final void setTheme(int i) {
        com.google.android.chimera.Activity f = f();
        int resourceId = ChimeraResource.getResourceId(this.l, f.getResources(), super.getResources(), i);
        super.setTheme(resourceId);
        f.setTheme(resourceId);
    }

    public final void setTitle(int i) {
        f().setTitle(i);
    }

    public final void setTitleColor(int i) {
        f().setTitleColor(i);
    }

    public final void setVisible(boolean z) {
        f().setVisible(z);
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        return f().shouldShowRequestPermissionRationale(str);
    }

    public final boolean shouldUpRecreateTask(Intent intent) {
        return f().shouldUpRecreateTask(intent);
    }

    public final boolean showAssist(Bundle bundle) {
        return f().showAssist(bundle);
    }

    public final void showLockTaskEscapeMessage() {
        f().showLockTaskEscapeMessage();
    }

    public final void startActivities(Intent[] intentArr) {
        f().startActivities(intentArr);
    }

    public final void startActivity(Intent intent) {
        f().startActivity(intent);
    }

    public final void startActivityForResult(Intent intent, int i) {
        f().startActivityForResult(intent, i);
    }

    public final void startActivityFromChild(android.app.Activity activity, Intent intent, int i) {
        f().startActivityFromChild(activity, intent, i);
    }

    public final boolean startActivityIfNeeded(Intent intent, int i) {
        return f().startActivityIfNeeded(intent, i);
    }

    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        f().startIntentSender(intentSender, intent, i, i2, i3);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        f().startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void startIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        f().startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public final void startLockTask() {
        f().startLockTask();
    }

    public final void startManagingCursor(Cursor cursor) {
        f().startManagingCursor(cursor);
    }

    public final boolean startNextMatchingActivity(Intent intent) {
        return f().startNextMatchingActivity(intent);
    }

    public final void startPostponedEnterTransition() {
        f().startPostponedEnterTransition();
    }

    public final void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        f().startSearch(str, z, bundle, z2);
    }

    public final void stopLockTask() {
        f().stopLockTask();
    }

    public final void stopManagingCursor(Cursor cursor) {
        f().stopManagingCursor(cursor);
    }

    public final void superAddContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
    }

    public final void superCloseContextMenu() {
        super.closeContextMenu();
    }

    public final void superCloseOptionsMenu() {
        super.closeOptionsMenu();
    }

    public final void superConvertFromTranslucent() {
        super.convertFromTranslucent();
    }

    public final boolean superConvertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions) {
        return super.convertToTranslucent(translucentConversionListener, activityOptions);
    }

    public final PendingIntent superCreatePendingResult(int i, Intent intent, int i2) {
        return super.createPendingResult(i, intent, i2);
    }

    public final boolean superDispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean superDispatchKeyEventChimera(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean superDispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean superDispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean superDispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public final View superFindViewById(int i) {
        return super.findViewById(i);
    }

    public final void superFinish() {
        super.finish();
    }

    public final void superFinishActivity(int i) {
        super.finishActivity(i);
    }

    public final void superFinishActivityFromChild(android.app.Activity activity, int i) {
        super.finishActivityFromChild(activity, i);
    }

    public final void superFinishAffinity() {
        super.finishAffinity();
    }

    public final void superFinishAfterTransition() {
        super.finishAfterTransition();
    }

    public final void superFinishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    public final void superFinishFromChild(android.app.Activity activity) {
        super.finishFromChild(activity);
    }

    public final ComponentName superGetCallingActivity() {
        return super.getCallingActivity();
    }

    public final String superGetCallingPackage() {
        return super.getCallingPackage();
    }

    public final int superGetChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public final ComponentName superGetComponentName() {
        return super.getComponentName();
    }

    public final Scene superGetContentScene() {
        return super.getContentScene();
    }

    public final TransitionManager superGetContentTransitionManager() {
        return super.getContentTransitionManager();
    }

    public final View superGetCurrentFocus() {
        return super.getCurrentFocus();
    }

    public final Intent superGetIntent() {
        Intent intent = super.getIntent();
        a(intent);
        return intent;
    }

    public final Object superGetLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    public final LayoutInflater superGetLayoutInflater() {
        return super.getLayoutInflater();
    }

    public final String superGetLocalClassName() {
        return super.getLocalClassName();
    }

    public final MenuInflater superGetMenuInflater() {
        return super.getMenuInflater();
    }

    public final Intent superGetParentActivityIntent() {
        Intent parentActivityIntent = super.getParentActivityIntent();
        a(parentActivityIntent);
        return parentActivityIntent;
    }

    public final SharedPreferences superGetPreferences(int i) {
        return super.getPreferences(i);
    }

    public final Uri superGetReferrer() {
        return super.getReferrer();
    }

    public final int superGetRequestedOrientation() {
        return super.getRequestedOrientation();
    }

    public final hl superGetSupportFragmentManager() {
        return super.at();
    }

    public final int superGetTaskId() {
        return super.getTaskId();
    }

    public final VoiceInteractor superGetVoiceInteractor() {
        return super.getVoiceInteractor();
    }

    public final Window superGetWindow() {
        return super.getWindow();
    }

    public final WindowManager superGetWindowManager() {
        return super.getWindowManager();
    }

    public final boolean superHasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final void superInvalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    public final boolean superIsBackgroundVisibleBehind() {
        return super.isBackgroundVisibleBehind();
    }

    public final boolean superIsChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    public final boolean superIsDestroyed() {
        return super.isDestroyed();
    }

    public final boolean superIsFinishing() {
        return super.isFinishing();
    }

    public final boolean superIsImmersive() {
        return super.isImmersive();
    }

    public final boolean superIsTaskRoot() {
        return super.isTaskRoot();
    }

    public final boolean superIsVoiceInteraction() {
        return super.isVoiceInteraction();
    }

    public final boolean superIsVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot();
    }

    public final boolean superMoveTaskToBack(boolean z) {
        return super.moveTaskToBack(z);
    }

    public final boolean superNavigateUpTo(Intent intent) {
        return super.navigateUpTo(intent);
    }

    public final boolean superNavigateUpToFromChild(android.app.Activity activity, Intent intent) {
        return super.navigateUpToFromChild(activity, intent);
    }

    public final void superOnActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    public final void superOnActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    public final void superOnActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
    }

    public final void superOnActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public final void superOnAttachFragment(gj gjVar) {
    }

    public final void superOnAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void superOnBackPressed() {
        super.onBackPressed();
    }

    public final void superOnBackgroundVisibleBehindChanged(boolean z) {
        super.onBackgroundVisibleBehindChanged(z);
    }

    public final void superOnChildTitleChanged(android.app.Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
    }

    public final void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void superOnContentChanged() {
        super.onContentChanged();
    }

    public final boolean superOnContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public final void superOnContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    public final void superOnCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final CharSequence superOnCreateDescription() {
        return super.onCreateDescription();
    }

    public final Dialog superOnCreateDialog(int i) {
        return super.onCreateDialog(i);
    }

    public final void superOnCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        super.onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public final boolean superOnCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean superOnCreatePanelMenu(int i, Menu menu) {
        return super.onCreatePanelMenu(i, menu);
    }

    public final View superOnCreatePanelView(int i) {
        return super.onCreatePanelView(i);
    }

    public final boolean superOnCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return super.onCreateThumbnail(bitmap, canvas);
    }

    public final View superOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            Log.e("ChimeraActivityProxy", "Chimera does not support inflating fragments at this time.");
            return null;
        }
        View a = box.a(this.l, context, str, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public final void superOnDestroy() {
        super.onDestroy();
    }

    public final void superOnDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void superOnEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    public final boolean superOnGenericMotionEvent(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean superOnKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean superOnKeyLongPress(int i, KeyEvent keyEvent) {
        return super.onKeyLongPress(i, keyEvent);
    }

    public final boolean superOnKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public final boolean superOnKeyShortcut(int i, KeyEvent keyEvent) {
        return super.onKeyShortcut(i, keyEvent);
    }

    public final boolean superOnKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public final void superOnLowMemory() {
        super.onLowMemory();
    }

    public final boolean superOnMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem);
    }

    public final boolean superOnMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public final boolean superOnNavigateUp() {
        return super.onNavigateUp();
    }

    public final boolean superOnNavigateUpFromChild(android.app.Activity activity) {
        return super.onNavigateUpFromChild(activity);
    }

    public final void superOnNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public final boolean superOnOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public final void superOnOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    public final void superOnPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public final void superOnPause() {
        super.onPause();
    }

    public final void superOnPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public final void superOnPostResume() {
        super.onPostResume();
    }

    public final void superOnPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    public final void superOnPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        super.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public final boolean superOnPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public final boolean superOnPrepareOptionsPanel(View view, Menu menu) {
        return super.a(view, menu);
    }

    public final boolean superOnPreparePanel(int i, View view, Menu menu) {
        return super.onPreparePanel(i, view, menu);
    }

    public final void superOnProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
    }

    public final void superOnProvideAssistData(Bundle bundle) {
        super.onProvideAssistData(bundle);
    }

    public final Uri superOnProvideReferrer() {
        return super.onProvideReferrer();
    }

    public final void superOnRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public final void superOnRestart() {
        super.onRestart();
    }

    public final void superOnRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public final void superOnResume() {
        super.onResume();
    }

    public final void superOnResumeFragments() {
        super.b();
    }

    public final Object superOnRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final void superOnSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public final boolean superOnSearchRequested() {
        return super.onSearchRequested();
    }

    public final void superOnStart() {
        super.onStart();
    }

    public final void superOnStateNotSaved() {
        super.onStateNotSaved();
    }

    public final void superOnStop() {
        super.onStop();
    }

    public final void superOnTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
    }

    public final boolean superOnTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean superOnTrackballEvent(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    public final void superOnTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    public final void superOnUserInteraction() {
        super.onUserInteraction();
    }

    public final void superOnUserLeaveHint() {
        super.onUserLeaveHint();
    }

    public final void superOnVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    public final void superOnWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    public final void superOnWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void superOpenContextMenu(View view) {
        super.openContextMenu(view);
    }

    public final void superOpenOptionsMenu() {
        super.openOptionsMenu();
    }

    public final void superOverridePendingTransition(int i, int i2) {
        Resources resources = super.getResources();
        Resources resources2 = f().getResources();
        super.overridePendingTransition(ChimeraResource.getResourceId(this.k, resources, resources2, i), ChimeraResource.getResourceId(this.k, resources, resources2, i2));
    }

    public final void superPostponeEnterTransition() {
        super.postponeEnterTransition();
    }

    public final void superRecreate() {
        super.recreate();
    }

    public final void superRegisterForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    public final boolean superReleaseInstance() {
        return super.releaseInstance();
    }

    public final void superReportFullyDrawn() {
        super.reportFullyDrawn();
    }

    public final boolean superRequestVisibleBehind(boolean z) {
        return super.requestVisibleBehind(z);
    }

    public final void superSetContentTransitionManager(TransitionManager transitionManager) {
        super.setContentTransitionManager(transitionManager);
    }

    public final void superSetContentView(int i) {
        super.setContentView(i);
    }

    public final void superSetFinishOnTouchOutside(boolean z) {
        super.setFinishOnTouchOutside(z);
    }

    public final void superSetImmersive(boolean z) {
        super.setImmersive(z);
    }

    public final void superSetIntent(Intent intent) {
        super.setIntent(intent);
    }

    public final void superSetRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
    }

    public final void superSetTaskDescription(ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    public final void superSetTitle(int i) {
        super.setTitle(i);
    }

    public final void superSetTitleColor(int i) {
        super.setTitleColor(i);
    }

    public final void superSetVisible(boolean z) {
        super.setVisible(z);
    }

    public final boolean superShouldShowRequestPermissionRationale(String str) {
        return super.shouldShowRequestPermissionRationale(str);
    }

    public final boolean superShouldUpRecreateTask(Intent intent) {
        return super.shouldUpRecreateTask(intent);
    }

    public final boolean superShowAssist(Bundle bundle) {
        return super.showAssist(bundle);
    }

    public final void superShowLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    public final void superStartActivities(Intent[] intentArr) {
        super.startActivities(intentArr);
    }

    public final void superStartActivity(Intent intent) {
        super.startActivity(intent);
    }

    public final void superStartActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public final void superStartActivityFromChild(android.app.Activity activity, Intent intent, int i) {
        super.startActivityFromChild(activity, intent, i);
    }

    public final boolean superStartActivityIfNeeded(Intent intent, int i) {
        return super.startActivityIfNeeded(intent, i);
    }

    public final void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        super.startIntentSender(intentSender, intent, i, i2, i3);
    }

    public final void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void superStartIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public final void superStartLockTask() {
        super.startLockTask();
    }

    public final void superStartManagingCursor(Cursor cursor) {
        super.startManagingCursor(cursor);
    }

    public final boolean superStartNextMatchingActivity(Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    public final void superStartPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    public final void superStartSearch(String str, boolean z, Bundle bundle, boolean z2) {
        super.startSearch(str, z, bundle, z2);
    }

    public final void superStopLockTask() {
        super.stopLockTask();
    }

    public final void superStopManagingCursor(Cursor cursor) {
        super.stopManagingCursor(cursor);
    }

    public final void superTakeKeyEvents(boolean z) {
        super.takeKeyEvents(z);
    }

    public final void superTriggerSearch(String str, Bundle bundle) {
        super.triggerSearch(str, bundle);
    }

    public final void superUnregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }

    public final void takeKeyEvents(boolean z) {
        f().takeKeyEvents(z);
    }

    public final void triggerSearch(String str, Bundle bundle) {
        f().triggerSearch(str, bundle);
    }

    public final void unregisterForContextMenu(View view) {
        f().unregisterForContextMenu(view);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        com.google.android.chimera.Activity f = f();
        b(bundle);
        return f.publicOnCreateDialog(i, bundle);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return f().onCreateView(str, context, attributeSet);
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        f().onPostCreate(a(bundle), persistableBundle);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        com.google.android.chimera.Activity f = f();
        b(bundle);
        f.publicOnPrepareDialog(i, dialog, bundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return f().onSearchRequested(searchEvent);
    }

    public final void setContentView(View view) {
        f().setContentView(view);
    }

    public final void setTitle(CharSequence charSequence) {
        f().setTitle(charSequence);
    }

    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        f().startActivities(intentArr, bundle);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        f().startActivity(intent, bundle);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        f().startActivityForResult(intent, i, bundle);
    }

    public final void startActivityFromChild(android.app.Activity activity, Intent intent, int i, Bundle bundle) {
        f().startActivityFromChild(activity, intent, i, bundle);
    }

    public final boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return f().startActivityIfNeeded(intent, i, bundle);
    }

    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        f().startIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        f().startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void startIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        f().startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        return f().startNextMatchingActivity(intent, bundle);
    }

    public final Object superGetLastCustomNonConfigurationInstance() {
        afy afy = (afy) getLastNonConfigurationInstance();
        if (afy != null) {
            return afy.a;
        }
        return null;
    }

    public final is superGetSupportLoaderManager() {
        return is.a((aj) this);
    }

    public final void superOnCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public final Dialog superOnCreateDialog(int i, Bundle bundle) {
        return super.onCreateDialog(i, bundle);
    }

    public final void superOnPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onPostCreate(bundle, persistableBundle);
    }

    public final void superOnPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
    }

    public final void superOnRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    public final void superOnSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    public final boolean superOnSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    public final void superSetContentView(View view) {
        super.setContentView(view);
    }

    public final void superSetTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public final void superStartActivities(Intent[] intentArr, Bundle bundle) {
        super.startActivities(intentArr, bundle);
    }

    public final void superStartActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    public final void superStartActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public final void superStartActivityFromChild(android.app.Activity activity, Intent intent, int i, Bundle bundle) {
        super.startActivityFromChild(activity, intent, i, bundle);
    }

    public final void superStartActivityFromFragment(gj gjVar, Intent intent, int i) {
        a(gjVar, intent, i);
    }

    public final boolean superStartActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return super.startActivityIfNeeded(intent, i, bundle);
    }

    public final void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        super.startIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public final void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void superStartIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final boolean superStartNextMatchingActivity(Intent intent, Bundle bundle) {
        return super.startNextMatchingActivity(intent, bundle);
    }

    public final void superSupportFinishAfterTransition() {
        int i = Build.VERSION.SDK_INT;
        finishAfterTransition();
    }

    public final void superSupportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public final void superSupportPostponeEnterTransition() {
        int i = Build.VERSION.SDK_INT;
        postponeEnterTransition();
    }

    public final void superSupportStartPostponedEnterTransition() {
        int i = Build.VERSION.SDK_INT;
        startPostponedEnterTransition();
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Bundle bundle2 = new Bundle();
        f().onSaveInstanceState(bundle2, persistableBundle);
        a(bundle, bundle2);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().setContentView(view, layoutParams);
    }

    public final void superSetContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Bundle a = a(bundle);
        if (a == null) {
            super.onRestoreInstanceState(new Bundle(), persistableBundle);
        } else {
            f().onRestoreInstanceState(a, persistableBundle);
        }
    }

    public final View superOnCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = box.a(this.l, context, str, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        f().onCreate(a(bundle), persistableBundle);
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        if (intent != null) {
            intent.setExtrasClassLoader(this.l);
        }
    }

    public final void a(Bundle bundle, Bundle bundle2) {
        ClassLoader classLoader;
        com.google.android.chimera.Activity f = f();
        ClassLoader classLoader2 = this.k;
        ClassLoader classLoader3 = this.l;
        hl at = super.at();
        if (bundle != null) {
            if (classLoader3 != null && !classLoader3.equals(classLoader2)) {
                Bundle bundle3 = null;
                for (String str : bundle2.keySet()) {
                    Object obj = bundle2.get(str);
                    if ((obj instanceof Parcelable) && (classLoader = obj.getClass().getClassLoader()) != null && !classLoader.equals(classLoader2)) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putParcelable(str, (Parcelable) obj);
                        bundle2.putParcelable(str, (Parcelable) null);
                    }
                }
                if (bundle3 == null) {
                    bundle2.remove("_chimera_top_level_wrapper_state");
                } else {
                    bundle2.putBundle("_chimera_top_level_wrapper_state", bundle3);
                }
                jt.a(bundle2, at);
            }
            try {
                ModuleManager.ModuleApkInfo currentModuleApk = ModuleManager.get(f).getCurrentModuleApk();
                bundle.putBundle("_chimera_module_state", bundle2);
                bundle.putInt("_chimera_module_apk_type", currentModuleApk.apkType);
                bundle.putLong("_chimera_module_apk_timestamp", currentModuleApk.apkTimestamp);
            } catch (IllegalStateException e) {
                Log.w("SavedInstanceUtils", "Could not obtain module apk info. Skipping check for moduleInfo in saved instance state.");
                bundle.putAll(bundle2);
            }
        }
    }

    public void a(com.google.android.chimera.Activity activity, Context context) {
        boolean z;
        if (this.r == null) {
            z = true;
        } else {
            z = false;
        }
        amtf.a(z);
        this.r = activity;
        this.l = context.getClassLoader();
        this.k = super.getClassLoader();
        this.m = this.l;
        activity.setProxy(this, context);
    }
}
