package com.google.android.gms.nearby.sharing.discovery;

import android.bluetooth.le.ScanResult;
import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastInitiation$2 extends nkz {
    public final /* synthetic */ vwi a;
    final /* synthetic */ vjf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastInitiation$2(vwi vwi, Context context, String str, vjf vjf) {
        super(context, str);
        this.a = vwi;
        this.b = vjf;
    }

    public final void a(int i) {
        this.a.a.submit(new vwd(this, i));
    }

    public final void a(int i, ScanResult scanResult) {
        this.a.a.submit(new vwc(this, this.b, scanResult));
    }
}
