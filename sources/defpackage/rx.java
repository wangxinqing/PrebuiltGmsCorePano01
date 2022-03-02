package defpackage;

import android.content.Intent;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* renamed from: rx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rx implements ActionMode.Callback {
    private final ActionMode.Callback a;
    private final TextView b;
    private Class c;
    private Method d;
    private boolean e;
    private boolean f = false;

    public rx(ActionMode.Callback callback, TextView textView) {
        this.a = callback;
        this.b = textView;
    }

    private static final Intent a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f6 A[SYNTHETIC, Splitter:B:46:0x00f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPrepareActionMode(android.view.ActionMode r11, android.view.Menu r12) {
        /*
            r10 = this;
            android.widget.TextView r0 = r10.b
            android.content.Context r0 = r0.getContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            boolean r2 = r10.f
            java.lang.String r3 = "removeItemAt"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0013
            goto L_0x0036
        L_0x0013:
            r10.f = r4
            java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            r10.c = r2     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            r6[r5] = r7     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            r10.d = r2     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            r10.e = r4     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002c }
            goto L_0x0036
        L_0x002c:
            r2 = move-exception
            goto L_0x002f
        L_0x002e:
            r2 = move-exception
        L_0x002f:
            r2 = 0
            r10.c = r2
            r10.d = r2
            r10.e = r5
        L_0x0036:
            boolean r2 = r10.e     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            if (r2 != 0) goto L_0x003b
            goto L_0x0046
        L_0x003b:
            java.lang.Class r2 = r10.c     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            boolean r2 = r2.isInstance(r12)     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            if (r2 == 0) goto L_0x0046
            java.lang.reflect.Method r2 = r10.d     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            goto L_0x0054
        L_0x0046:
            java.lang.Class r2 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            r6[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
        L_0x0054:
            int r3 = r12.size()     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            int r3 = r3 + -1
        L_0x005a:
            if (r3 >= 0) goto L_0x00f6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L_0x00a7
            android.content.Intent r3 = a()
            java.util.List r3 = r1.queryIntentActivities(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00a5
            java.lang.Object r6 = r3.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            java.lang.String r7 = r0.getPackageName()
            android.content.pm.ActivityInfo r8 = r6.activityInfo
            java.lang.String r8 = r8.packageName
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00a1
            android.content.pm.ActivityInfo r7 = r6.activityInfo
            boolean r7 = r7.exported
            if (r7 == 0) goto L_0x0071
            android.content.pm.ActivityInfo r7 = r6.activityInfo
            java.lang.String r7 = r7.permission
            if (r7 == 0) goto L_0x00a1
            android.content.pm.ActivityInfo r7 = r6.activityInfo
            java.lang.String r7 = r7.permission
            int r7 = r0.checkSelfPermission(r7)
            if (r7 != 0) goto L_0x0071
        L_0x00a1:
            r2.add(r6)
            goto L_0x0071
        L_0x00a5:
            r0 = 0
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            int r3 = r2.size()
            if (r0 >= r3) goto L_0x0124
            java.lang.Object r3 = r2.get(r0)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            int r6 = r0 + 100
            java.lang.CharSequence r7 = r3.loadLabel(r1)
            android.view.MenuItem r6 = r12.add(r5, r5, r6, r7)
            android.widget.TextView r7 = r10.b
            android.content.Intent r8 = a()
            boolean r9 = r7 instanceof android.text.Editable
            if (r9 == 0) goto L_0x00d8
            boolean r9 = r7.onCheckIsTextEditor()
            if (r9 == 0) goto L_0x00d8
            boolean r7 = r7.isEnabled()
            if (r7 != 0) goto L_0x00d6
            r7 = 0
            goto L_0x00d9
        L_0x00d6:
            r7 = 1
            goto L_0x00d9
        L_0x00d8:
            r7 = 0
        L_0x00d9:
            r7 = r7 ^ r4
            java.lang.String r9 = "android.intent.extra.PROCESS_TEXT_READONLY"
            android.content.Intent r7 = r8.putExtra(r9, r7)
            android.content.pm.ActivityInfo r8 = r3.activityInfo
            java.lang.String r8 = r8.packageName
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.name
            android.content.Intent r3 = r7.setClassName(r8, r3)
            android.view.MenuItem r3 = r6.setIntent(r3)
            r3.setShowAsAction(r4)
            int r0 = r0 + 1
            goto L_0x00a8
        L_0x00f6:
            android.view.MenuItem r6 = r12.getItem(r3)     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            android.content.Intent r7 = r6.getIntent()     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            if (r7 == 0) goto L_0x011b
            java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
            android.content.Intent r6 = r6.getIntent()     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            java.lang.String r6 = r6.getAction()     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            boolean r6 = r7.equals(r6)     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            if (r6 == 0) goto L_0x011b
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            r6[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
            r2.invoke(r12, r6)     // Catch:{ NoSuchMethodException -> 0x0123, IllegalAccessException -> 0x0121, InvocationTargetException -> 0x011f }
        L_0x011b:
            int r3 = r3 + -1
            goto L_0x005a
        L_0x011f:
            r0 = move-exception
            goto L_0x0124
        L_0x0121:
            r0 = move-exception
            goto L_0x0124
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            android.view.ActionMode$Callback r0 = r10.a
            boolean r11 = r0.onPrepareActionMode(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
