package defpackage;

import android.app.Dialog;
import android.app.TaskStackBuilder;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ModuleContext;

/* renamed from: hdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdi extends bjz {
    private ihh q;
    private njy r = null;

    protected hdi() {
        hem.a();
    }

    public final void a(Activity activity, Context context) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            ihh ihh = new ihh(context);
            this.q = ihh;
            context = ihh;
        }
        this.r = new njy(context, (Class) activity.getClass(), 6);
        super.a(activity, njw.a(context));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        amky a = njy.a(this.r, "onResumeFragments");
        try {
            f().publicOnResumeFragments();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context, name), 128);
            if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("chimera.requiresExtractedAsset")) == null) {
                return true;
            }
            hem a = hem.a();
            StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
            sb.append(string);
            sb.append(" ");
            sb.append(name);
            a.a(context, 82, sb.toString());
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final void d() {
        hey.a(true);
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        if (!ihs.b().getInSafeBoot()) {
            return bjz.p.a(this, this);
        }
        return false;
    }

    public final Object h() {
        amky a = njy.a(this.r, "onRetainCustomNonConfigurationInstance");
        try {
            Object onRetainCustomNonConfigurationInstance = f().onRetainCustomNonConfigurationInstance();
            if (a != null) {
                a.close();
            }
            return onRetainCustomNonConfigurationInstance;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        amky a = njy.a(this.r, "onActionModeFinished");
        try {
            f().onActionModeFinished(actionMode);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        amky a = njy.a(this.r, "onActionModeStarted");
        try {
            f().onActionModeStarted(actionMode);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r1 instanceof defpackage.boa) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            njy r0 = r3.r
            java.lang.String r1 = "onActivityResult"
            amky r0 = defpackage.njy.a((defpackage.njy) r0, (java.lang.String) r1)
            com.google.android.chimera.Activity r1 = r3.f()     // Catch:{ all -> 0x0026 }
            if (r6 == 0) goto L_0x001d
            r3.a((android.content.Intent) r6)     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "_chimera_fallback_only"
            boolean r2 = r6.hasExtra(r2)     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x001d
            boolean r2 = r1 instanceof defpackage.boa     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0020
        L_0x001d:
            r1.publicOnActivityResult(r4, r5, r6)     // Catch:{ all -> 0x0026 }
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            r0.close()
        L_0x0025:
            return
        L_0x0026:
            r4 = move-exception
            if (r0 == 0) goto L_0x0031
            r0.close()     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r5 = move-exception
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r5)
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdi.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onAttachedToWindow() {
        amky a = njy.a(this.r, "onAttachedToWindow");
        try {
            f().onAttachedToWindow();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        amky a = njy.a(this.r, "onBackPressed");
        try {
            f().onBackPressed();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        amky a = njy.a(this.r, "onConfigurationChanged");
        try {
            ihh ihh = this.q;
            if (ihh != null) {
                ihh.a(configuration);
            }
            ModuleContext moduleContext = ModuleContext.getModuleContext(f().getApplicationContext());
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            f().onConfigurationChanged(configuration);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onContentChanged() {
        amky a = njy.a(this.r, "onContentChanged");
        try {
            f().onContentChanged();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        amky a = njy.a(this.r, "onContextItemSelected");
        try {
            boolean onContextItemSelected = f().onContextItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onContextItemSelected;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onContextMenuClosed(Menu menu) {
        amky a = njy.a(this.r, "onContextMenuClosed");
        try {
            f().onContextMenuClosed(menu);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        amky a = njy.a(this.r, "onCreate");
        if (bundle == null) {
            try {
                this.o = true;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (bundle != null) {
            this.o = bundle.getBoolean("_chimera_attempt_ftr_req", false);
            if (this.l != this.k) {
                this.n = bundle.getString("_chimera_rpt_frg_cls");
                String str = this.n;
                if (str != null) {
                    this.m = new bof(this.k, this.l, true, new String[]{str});
                }
            }
        }
        f().publicOnCreate(super.a(bundle));
        if (a != null) {
            a.close();
            return;
        }
        return;
        throw th;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        amky a = njy.a(this.r, "onCreateContextMenu");
        try {
            f().onCreateContextMenu(contextMenu, view, contextMenuInfo);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final CharSequence onCreateDescription() {
        amky a = njy.a(this.r, "onCreateDescription");
        try {
            CharSequence onCreateDescription = f().onCreateDescription();
            if (a != null) {
                a.close();
            }
            return onCreateDescription;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final Dialog onCreateDialog(int i) {
        amky a = njy.a(this.r, "onCreateDialog");
        try {
            Dialog publicOnCreateDialog = f().publicOnCreateDialog(i);
            if (a != null) {
                a.close();
            }
            return publicOnCreateDialog;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        amky a = njy.a(this.r, "onCreateNavigateUpTaskStack");
        try {
            f().onCreateNavigateUpTaskStack(taskStackBuilder);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        amky a = njy.a(this.r, "onCreateOptionsMenu");
        try {
            boolean onCreateOptionsMenu = f().onCreateOptionsMenu(menu);
            if (a != null) {
                a.close();
            }
            return onCreateOptionsMenu;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        amky a = njy.a(this.r, "onCreatePanelMenu");
        try {
            boolean onCreatePanelMenu = f().onCreatePanelMenu(i, menu);
            if (a != null) {
                a.close();
            }
            return onCreatePanelMenu;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final View onCreatePanelView(int i) {
        amky a = njy.a(this.r, "onCreatePanelView");
        try {
            View onCreatePanelView = f().onCreatePanelView(i);
            if (a != null) {
                a.close();
            }
            return onCreatePanelView;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        amky a = njy.a(this.r, "onCreateThumbnail");
        try {
            boolean onCreateThumbnail = f().onCreateThumbnail(bitmap, canvas);
            if (a != null) {
                a.close();
            }
            return onCreateThumbnail;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        amky a = njy.a(this.r, "onDestroy");
        try {
            f().publicOnDestroy();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onDetachedFromWindow() {
        amky a = njy.a(this.r, "onDetachedFromWindow");
        try {
            f().onDetachedFromWindow();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onEnterAnimationComplete() {
        amky a = njy.a(this.r, "onEnterAnimationComplete");
        try {
            f().onEnterAnimationComplete();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        amky a = njy.a(this.r, "onGenericMotionEvent");
        try {
            boolean onGenericMotionEvent = f().onGenericMotionEvent(motionEvent);
            if (a != null) {
                a.close();
            }
            return onGenericMotionEvent;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        amky a = njy.a(this.r, "onKeyDown");
        try {
            boolean onKeyDown = f().onKeyDown(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyDown;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        amky a = njy.a(this.r, "onKeyLongPress");
        try {
            boolean onKeyLongPress = f().onKeyLongPress(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyLongPress;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        amky a = njy.a(this.r, "onKeyMultiple");
        try {
            boolean onKeyMultiple = f().onKeyMultiple(i, i2, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyMultiple;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        amky a = njy.a(this.r, "onKeyShortcut");
        try {
            boolean onKeyShortcut = f().onKeyShortcut(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyShortcut;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        amky a = njy.a(this.r, "onKeyUp");
        try {
            boolean onKeyUp = f().onKeyUp(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyUp;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onLowMemory() {
        amky a = njy.a(this.r, "onLowMemory");
        try {
            f().onLowMemory();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        amky a = njy.a(this.r, "onMenuItemSelected");
        try {
            boolean onMenuItemSelected = f().onMenuItemSelected(i, menuItem);
            if (a != null) {
                a.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        amky a = njy.a(this.r, "onMenuOpened");
        try {
            boolean onMenuOpened = f().onMenuOpened(i, menu);
            if (a != null) {
                a.close();
            }
            return onMenuOpened;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onNavigateUp() {
        amky a = njy.a(this.r, "onNavigateUp");
        try {
            boolean onNavigateUp = f().onNavigateUp();
            if (a != null) {
                a.close();
            }
            return onNavigateUp;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onNavigateUpFromChild(android.app.Activity activity) {
        amky a = njy.a(this.r, "onNavigateUpFromChild");
        try {
            boolean onNavigateUpFromChild = f().onNavigateUpFromChild(activity);
            if (a != null) {
                a.close();
            }
            return onNavigateUpFromChild;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        amky a = njy.a(this.r, "onNewIntent");
        try {
            Activity f = f();
            a(intent);
            f.publicOnNewIntent(intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        amky a = njy.a(this.r, "onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = f().onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onOptionsMenuClosed(Menu menu) {
        amky a = njy.a(this.r, "onOptionsMenuClosed");
        try {
            f().onOptionsMenuClosed(menu);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onPanelClosed(int i, Menu menu) {
        amky a = njy.a(this.r, "onPanelClosed");
        try {
            f().onPanelClosed(i, menu);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        amky a = njy.a(this.r, "onPause");
        try {
            f().publicOnPause();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        amky a = njy.a(this.r, "onPostCreate");
        try {
            f().publicOnPostCreate(super.a(bundle));
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        amky a = njy.a(this.r, "onPostResume");
        try {
            f().publicOnPostResume();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPrepareDialog(int i, Dialog dialog) {
        amky a = njy.a(this.r, "onPrepareDialog");
        try {
            f().publicOnPrepareDialog(i, dialog);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        amky a = njy.a(this.r, "onPrepareNavigateUpTaskStack");
        try {
            f().onPrepareNavigateUpTaskStack(taskStackBuilder);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        amky a = njy.a(this.r, "onPrepareOptionsMenu");
        try {
            boolean onPrepareOptionsMenu = f().onPrepareOptionsMenu(menu);
            if (a != null) {
                a.close();
            }
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        amky a = njy.a(this.r, "onPreparePanel");
        try {
            boolean onPreparePanel = f().onPreparePanel(i, view, menu);
            if (a != null) {
                a.close();
            }
            return onPreparePanel;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onProvideAssistContent(AssistContent assistContent) {
        amky a = njy.a(this.r, "onProvideAssistContent");
        try {
            f().onProvideAssistContent(assistContent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onProvideAssistData(Bundle bundle) {
        amky a = njy.a(this.r, "onProvideAssistData");
        try {
            f().onProvideAssistData(bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        amky a = njy.a(this.r, "onRequestPermissionsResult");
        try {
            f().onRequestPermissionsResult(i, strArr, iArr);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        amky a = njy.a(this.r, "onRestart");
        try {
            f().publicOnRestart();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        amky a = njy.a(this.r, "onRestoreInstanceState");
        try {
            super.onRestoreInstanceState(bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        amky a = njy.a(this.r, "onResume");
        try {
            f().publicOnResume();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        amky a = njy.a(this.r, "onSaveInstanceState");
        try {
            Bundle bundle2 = new Bundle();
            f().publicOnSaveInstanceState(bundle2);
            if (bundle != null) {
                super.a(bundle, bundle2);
                bundle.putString("_chimera_rpt_frg_cls", this.n);
                bundle.putBoolean("_chimera_attempt_ftr_req", this.o);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onSearchRequested() {
        amky a = njy.a(this.r, "onSearchRequested");
        try {
            boolean onSearchRequested = f().onSearchRequested();
            if (a != null) {
                a.close();
            }
            return onSearchRequested;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        amky a = njy.a(this.r, "onStart");
        try {
            f().publicOnStart();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onStateNotSaved() {
        amky a = njy.a(this.r, "onStateNotSaved");
        try {
            f().onStateNotSaved();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        amky a = njy.a(this.r, "onStop");
        try {
            f().publicOnStop();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        amky a = njy.a(this.r, "onTitleChanged");
        try {
            f().publicOnTitleChanged(charSequence, i);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        amky a = njy.a(this.r, "onTouchEvent");
        try {
            boolean onTouchEvent = f().onTouchEvent(motionEvent);
            if (a != null) {
                a.close();
            }
            return onTouchEvent;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        amky a = njy.a(this.r, "onTrackballEvent");
        try {
            boolean onTrackballEvent = f().onTrackballEvent(motionEvent);
            if (a != null) {
                a.close();
            }
            return onTrackballEvent;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onTrimMemory(int i) {
        amky a = njy.a(this.r, "onTrimMemory");
        try {
            f().onTrimMemory(i);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        amky a = njy.a(this.r, "onUserInteraction");
        try {
            f().onUserInteraction();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        amky a = njy.a(this.r, "onUserLeaveHint");
        try {
            f().publicOnUserLeaveHint();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        amky a = njy.a(this.r, "onWindowAttributesChanged");
        try {
            f().onWindowAttributesChanged(layoutParams);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z) {
        amky a = njy.a(this.r, "onWindowFocusChanged");
        try {
            f().onWindowFocusChanged(z);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        amky a = njy.a(this.r, "onRestoreInstanceStateWithPersistentState");
        try {
            super.onRestoreInstanceState(bundle, persistableBundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final Dialog onCreateDialog(int i, Bundle bundle) {
        amky a = njy.a(this.r, "onCreateDialogWithArgs");
        try {
            Activity f = f();
            super.b(bundle);
            Dialog publicOnCreateDialog = f.publicOnCreateDialog(i, bundle);
            if (a != null) {
                a.close();
            }
            return publicOnCreateDialog;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        amky a = njy.a(this.r, "onPostCreateWithPersistentState");
        try {
            f().onPostCreate(super.a(bundle), persistableBundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        amky a = njy.a(this.r, "onPrepareDialogWithArgs");
        try {
            Activity f = f();
            super.b(bundle);
            f.publicOnPrepareDialog(i, dialog, bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        amky a = njy.a(this.r, "onSearchRequestedWithEvent");
        try {
            boolean onSearchRequested = f().onSearchRequested(searchEvent);
            if (a != null) {
                a.close();
            }
            return onSearchRequested;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.gj r3) {
        /*
            r2 = this;
            njy r0 = r2.r
            java.lang.String r1 = "onAttachFragment"
            amky r0 = defpackage.njy.a((defpackage.njy) r0, (java.lang.String) r1)
            boolean r1 = r3 instanceof com.google.android.chimera.Fragment.ProxyCallbacks     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x000d
            goto L_0x001d
        L_0x000d:
            com.google.android.chimera.Fragment$ProxyCallbacks r3 = (com.google.android.chimera.Fragment.ProxyCallbacks) r3     // Catch:{ all -> 0x002a }
            com.google.android.chimera.Fragment r3 = r3.getModuleFragment()     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x001d
            com.google.android.chimera.Activity r1 = r2.f()     // Catch:{ all -> 0x002a }
            r1.onAttachFragment(r3)     // Catch:{ all -> 0x002a }
            goto L_0x0024
        L_0x001d:
            java.lang.String r3 = "ChimeraActivityProxy"
            java.lang.String r1 = "Attaching a non chimera fragment to a chimera activity"
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x002a }
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.close()
        L_0x0029:
            return
        L_0x002a:
            r3 = move-exception
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r0)
        L_0x0035:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdi.a(gj):void");
    }

    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        amky a = njy.a(this.r, "onSaveInstanceStateWithPersistentState");
        try {
            Bundle bundle2 = new Bundle();
            f().onSaveInstanceState(bundle2, persistableBundle);
            super.a(bundle, bundle2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        amky a = njy.a(this.r, "onCreateWithPersistentState");
        try {
            f().onCreate(super.a(bundle), persistableBundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        a((Activity) obj, context);
    }

    /* access modifiers changed from: protected */
    public final boolean a(View view, Menu menu) {
        amky a = njy.a(this.r, "onPrepareOptionsPanel");
        try {
            boolean publicOnPrepareOptionsPanel = f().publicOnPrepareOptionsPanel(view, menu);
            if (a != null) {
                a.close();
            }
            return publicOnPrepareOptionsPanel;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
