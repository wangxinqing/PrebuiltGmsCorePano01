package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: hzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hzf extends qcd {
    private static final iwd a = new iwd("CommonAccount", "DelegationActivity");
    private hze b;
    private String c;

    /* access modifiers changed from: protected */
    public abstract String e();

    /* access modifiers changed from: protected */
    public boolean f() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            setResult(i2, intent);
        } else {
            setResult(i2);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String stringExtra;
        setTheme(2132017632);
        super.onCreate(bundle);
        boolean f = f();
        Intent intent = getIntent();
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            a.d("Unable to get caller identity", new Object[0]);
            a2 = null;
        } else if (f && !qby.a((Context) this, a2)) {
            a.d("App was not signed by Google.", new Object[0]);
            a2 = null;
        } else if (ampw.a(a2, getPackageName()) && (stringExtra = intent.getStringExtra("realClientPackage")) != null) {
            a2 = stringExtra;
        }
        this.c = a2;
        if (a2 != null) {
            this.b = (hze) qck.a(this).a(hze.class);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        hze hze = this.b;
        if (!hze.c) {
            hze.c = true;
            String e = e();
            Intent intent = getIntent();
            Intent intent2 = new Intent();
            intent2.setClassName(this, e);
            intent2.replaceExtras(intent.getExtras());
            intent2.putExtra("realClientPackage", this.c);
            startActivityForResult(intent2, 100);
        }
    }
}
