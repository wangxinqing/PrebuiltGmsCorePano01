package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: yzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzi implements yzg, ica, icb, yuu {
    public String a;
    public String b;
    public String c;
    public final yui d = yuv.a;
    public yuv e;
    public yzf f;
    public Activity g;
    public boolean h;
    public UpgradeAccountEntity i;
    public UpgradeAccountEntity j;
    private UpgradeAccountEntity k;

    static {
        ((Boolean) ysu.J.c()).booleanValue();
    }

    public static Bundle a(String str, String str2, PlusCommonExtras plusCommonExtras) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", str2);
        plusCommonExtras.a(bundle);
        return bundle;
    }

    public final void g(Bundle bundle) {
        if (this.i == null) {
            this.e.a((yuu) this, this.b, (UpgradeAccountEntity) null);
        } else if (this.h) {
            this.e.a((yuu) this, this.b, this.j);
        }
    }

    public final void a(int i2) {
        if (this.i == null || this.h) {
            this.e.t();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        yzf yzf = this.f;
        if (yzf != null) {
            yzf.b(connectionResult, (UpgradeAccountEntity) null);
        }
    }

    public final void a(ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        if (!connectionResult.b()) {
            yzf yzf = this.f;
            if (yzf != null) {
                yzf.b(connectionResult, upgradeAccountEntity);
            }
            this.h = false;
        } else if (this.i == null) {
            this.i = upgradeAccountEntity;
            yzf yzf2 = this.f;
            if (yzf2 != null) {
                yzf2.a(connectionResult, upgradeAccountEntity);
            }
        } else if (this.h) {
            this.h = false;
            this.j = null;
            this.k = upgradeAccountEntity;
            yzf yzf3 = this.f;
            if (yzf3 != null) {
                yzf3.b(connectionResult, upgradeAccountEntity);
            }
        }
    }
}
