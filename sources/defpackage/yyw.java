package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: yyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yyw extends FragmentActivity implements yxv {
    protected String a;
    protected String b;
    public int c;

    private final ClickableSpan a(String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.plus.oob.UpgradeAccountInfoActivity").putExtra("title", str2).putExtra("text", str).putExtra("button_text", (String) null).putExtra("com.google.android.gms.plus.OVERRIDE_THEME", this.c);
        putExtra.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", this.a);
        putExtra.putExtra("com.google.android.gms.common.oob.EXTRAS_CLIENT_CALLING_APP_PACKAGE", this.b);
        return new yxt(this, new yxr(putExtra), new yxs(this, this.a, bd(), favaDiagnosticsEntity, this.b));
    }

    public void a() {
    }

    public final void b(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        izr.a(this, this.a, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.b);
    }

    public final FavaDiagnosticsEntity bd() {
        if (c()) {
            return iar.g;
        }
        return iar.b;
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        int i = Build.VERSION.SDK_INT;
        return this.c == 2;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.c = getIntent().getIntExtra("com.google.android.gms.plus.OVERRIDE_THEME", 0);
        if (c()) {
            setTheme(16973931);
        } else if (this.c != 1) {
            setTheme(2132019132);
        } else {
            setTheme(2132019131);
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("com.google.android.gms.common.oob.EXTRAS_CLIENT_CALLING_APP_PACKAGE");
        this.b = string;
        if (string == null) {
            Log.e("UpgradeAccount", "Required client calling package extra is unspecified");
            e();
            return;
        }
        String string2 = extras.getString("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME");
        this.a = string2;
        if (TextUtils.isEmpty(string2)) {
            Log.e("UpgradeAccount", "Required account name extra is unspecified");
            e();
        }
    }

    private final ClickableSpan a(String str, String str2, String str3) {
        return new yzc(this, str, str2, str3);
    }

    public final ClickableSpan a(String str, zdr zdr, String str2) {
        String str3 = null;
        if (zdr != null && zdr.g()) {
            str3 = zdr.f().toString();
        }
        return a(str, str3, str2);
    }

    public final ClickableSpan a(String str, zdt zdt) {
        String str2;
        FavaDiagnosticsEntity favaDiagnosticsEntity;
        String str3 = null;
        if (zdt.e()) {
            str2 = zdt.d().toString();
        } else {
            str2 = null;
        }
        if (zdt.g()) {
            str3 = zdt.f().toString();
        }
        if ("picasa".equals(str)) {
            favaDiagnosticsEntity = iar.f;
        } else {
            favaDiagnosticsEntity = iar.a;
        }
        return a(str2, str3, favaDiagnosticsEntity);
    }

    public final ClickableSpan a(String str, zdt zdt, String str2) {
        String str3 = null;
        if (zdt != null && zdt.g()) {
            str3 = zdt.f().toString();
        }
        return a(str, str3, str2);
    }

    public final ClickableSpan a(String str, zif zif, String str2) {
        String str3 = null;
        if (zif != null && zif.g()) {
            str3 = zif.f().toString();
        }
        return a(str, str3, str2);
    }

    public final ClickableSpan a(zdr zdr) {
        String str;
        String str2 = null;
        if (zdr.e()) {
            str = zdr.d().toString();
        } else {
            str = null;
        }
        if (zdr.g()) {
            str2 = zdr.f().toString();
        }
        return a(str, str2, iar.a);
    }

    public final ClickableSpan a(zif zif) {
        String str;
        String str2 = null;
        if (zif.e()) {
            str = zif.d().toString();
        } else {
            str = null;
        }
        if (zif.g()) {
            str2 = zif.f().toString();
        }
        return a(str, str2, iar.a);
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        a(favaDiagnosticsEntity, bd());
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        izr.a((Context) this, this.a, (String) null, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.b);
    }
}
