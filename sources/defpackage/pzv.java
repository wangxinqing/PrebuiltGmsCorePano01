package defpackage;

import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

/* renamed from: pzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pzv implements amqy {
    static final amqy a = new pzv();

    private pzv() {
    }

    public final Object a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        String str2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ScopeDetail scopeDetail = (ScopeDetail) obj;
        int i = pzw.a;
        ArrayList a2 = anda.a((Iterable) scopeDetail.a());
        FACLData fACLData = scopeDetail.h;
        boolean z12 = false;
        if (fACLData != null) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            str2 = null;
            str = null;
            z7 = false;
            z6 = false;
            z5 = false;
            z4 = false;
            z3 = false;
            z2 = false;
        } else {
            FACLConfig fACLConfig = fACLData.b;
            if (fACLConfig != null) {
                str3 = fACLConfig.c;
                z12 = fACLConfig.g;
                z10 = fACLConfig.e;
                z9 = fACLConfig.f;
                z8 = fACLConfig.b;
                z11 = fACLConfig.d;
            } else {
                z11 = false;
                z10 = false;
                z9 = false;
                z8 = false;
            }
            str = fACLData.c;
            z7 = fACLData.d;
            z6 = z12;
            z2 = z11;
            z5 = z10;
            z4 = z9;
            z3 = z8;
            str2 = str3;
        }
        return new ScopeData(scopeDetail.b, scopeDetail.c, scopeDetail.d, scopeDetail.e, z, str2, str, z7, z6, z5, z4, z3, z2, a2, scopeDetail.f);
    }
}
