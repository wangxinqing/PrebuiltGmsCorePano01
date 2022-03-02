package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ggc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ggc extends gfw implements TextWatcher {
    private Boolean a;
    protected FrameLayout f;
    protected View g;
    protected boolean h = true;
    protected TextView i;
    protected int j;
    protected final View.OnClickListener k = new gfx(this);
    public final View.OnClickListener l = new gfy(this);
    private final TextView.OnEditorActionListener m = new gfz(this);

    public static boolean a(String str) {
        return str.indexOf(46) < str.length() + -1 && str.indexOf(46) > 0 && str.indexOf(64) < 0;
    }

    public final void afterTextChanged(Editable editable) {
        f();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int keyCode2 = keyEvent.getKeyCode();
        int keyCode3 = keyEvent.getKeyCode();
        int keyCode4 = keyEvent.getKeyCode();
        int keyCode5 = keyEvent.getKeyCode();
        if (keyCode != 4) {
            if (!keyEvent.isSystem() || keyCode2 == 82 || keyCode3 == 5 || keyCode4 == 24 || keyCode5 == 25) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        } else if (this.h) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final View e() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            return frameLayout.getChildAt(0);
        }
        return null;
    }

    public void f() {
    }

    public final void finish() {
        super.finish();
        int i2 = Build.VERSION.SDK_INT;
        overridePendingTransition(17432576, 17432577);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (((java.lang.Boolean) defpackage.fyj.b.invoke(r0, new java.lang.Object[0])).booleanValue() != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x00b7
            java.lang.reflect.Method r0 = defpackage.fyj.a
            r1 = 1
            if (r0 == 0) goto L_0x006d
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r6)
            java.lang.reflect.Method r2 = defpackage.fyj.b
            r3 = 0
            if (r2 == 0) goto L_0x0029
            java.lang.reflect.Method r2 = defpackage.fyj.b     // Catch:{ Exception -> 0x0028 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0028 }
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch:{ Exception -> 0x0028 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0028 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0029
            goto L_0x006d
        L_0x0028:
            r0 = move-exception
        L_0x0029:
            boolean r0 = r6.d()
            if (r0 == 0) goto L_0x006d
            r0 = 9
            r6.requestWindowFeature(r0)
            java.lang.reflect.Method r0 = defpackage.fyj.a
            if (r0 == 0) goto L_0x004f
            java.lang.reflect.Method r0 = defpackage.fyj.a     // Catch:{ Exception -> 0x004e }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x004e }
            java.lang.Object r0 = r0.invoke(r6, r2)     // Catch:{ Exception -> 0x004e }
            java.lang.reflect.Method r2 = defpackage.fyj.d     // Catch:{ Exception -> 0x004e }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x004e }
            r4[r3] = r5     // Catch:{ Exception -> 0x004e }
            r2.invoke(r0, r4)     // Catch:{ Exception -> 0x004e }
            goto L_0x004f
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            java.lang.reflect.Method r0 = defpackage.fyj.a
            if (r0 == 0) goto L_0x0071
            java.lang.reflect.Method r0 = defpackage.fyj.a     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x006b }
            java.lang.Object r0 = r0.invoke(r6, r2)     // Catch:{ Exception -> 0x006b }
            if (r0 == 0) goto L_0x0071
            java.lang.reflect.Method r2 = defpackage.fyj.e     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x006b }
            r1[r3] = r4     // Catch:{ Exception -> 0x006b }
            r2.invoke(r0, r1)     // Catch:{ Exception -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r0 = move-exception
            goto L_0x0071
        L_0x006d:
            r6.requestWindowFeature(r1)
        L_0x0071:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            r6.f = r0
            r6.g()
            if (r7 == 0) goto L_0x0085
            java.lang.String r0 = "nextRequest"
            int r7 = r7.getInt(r0)
            r6.j = r7
        L_0x0085:
            int r7 = android.os.Build.VERSION.SDK_INT
            r7 = 2131429028(0x7f0b06a4, float:1.8479717E38)
            android.view.View r7 = r6.findViewById(r7)
            if (r7 == 0) goto L_0x0096
            r0 = 2131230946(0x7f0800e2, float:1.807796E38)
            r7.setBackgroundResource(r0)
        L_0x0096:
            r7 = 2131427622(0x7f0b0126, float:1.8476865E38)
            android.view.View r7 = r6.findViewById(r7)
            r0 = 2131230950(0x7f0800e6, float:1.8077967E38)
            if (r7 == 0) goto L_0x00a5
            r7.setBackgroundResource(r0)
        L_0x00a5:
            r7 = 2131427705(0x7f0b0179, float:1.8477034E38)
            android.view.View r7 = r6.findViewById(r7)
            if (r7 == 0) goto L_0x00b1
            r7.setBackgroundResource(r0)
        L_0x00b1:
            android.widget.FrameLayout r7 = r6.f
            super.setContentView((android.view.View) r7)
            return
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggc.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        View findViewById;
        super.onRestoreInstanceState(bundle);
        int i2 = bundle.getInt("currentFocus", -1);
        if (i2 != -1 && (findViewById = findViewById(i2)) != null) {
            findViewById.requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        View currentFocus = getCurrentFocus();
        bundle.putInt("currentFocus", currentFocus != null ? currentFocus.getId() : -1);
        bundle.putInt("nextRequest", this.j);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void setContentView(int i2) {
        setContentView(getLayoutInflater().inflate(i2, (ViewGroup) null));
    }

    public final void setTitle(int i2) {
        setTitle((CharSequence) getString(i2));
    }

    public final void startActivity(Intent intent) {
        super.startActivity(intent);
        int i2 = Build.VERSION.SDK_INT;
        overridePendingTransition(17432576, 17432577);
    }

    public final void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
        int i3 = Build.VERSION.SDK_INT;
        overridePendingTransition(17432576, 17432577);
    }

    /* access modifiers changed from: protected */
    public final void a(View view, boolean z) {
        if (z) {
            this.g = view;
        }
        if (view instanceof EditText) {
            ((EditText) view).setOnEditorActionListener(this.m);
        } else {
            view.setOnClickListener(this.l);
        }
    }

    /* access modifiers changed from: protected */
    public final void g() {
        int i2 = Build.VERSION.SDK_INT;
        if (this.e) {
            Boolean bool = this.a;
            if (bool == null || !bool.booleanValue()) {
                this.a = true;
                View decorView = getWindow().getDecorView();
                decorView.getViewTreeObserver().addOnPreDrawListener(new gga(decorView));
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 5634);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(17170445);
                getWindow().setNavigationBarColor(17170445);
                return;
            }
            return;
        }
        h();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        int i2 = Build.VERSION.SDK_INT;
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue()) {
            this.a = false;
            View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnPreDrawListener(new ggb(decorView));
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5635);
            getWindow().clearFlags(Integer.MIN_VALUE);
        }
    }

    public final void setContentView(View view) {
        this.f.addView(view);
        this.i = (TextView) findViewById(R.id.title);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.title);
        this.i = textView;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }
}
