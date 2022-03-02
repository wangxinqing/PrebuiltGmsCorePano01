package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: lby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lby extends kyl implements kyt, kyu {
    public lby(String str) {
        super(str, 4100000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        bundle.putString(this.a, (String) obj);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.getString(this.a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return dataHolder.c(this.a, i, i2);
    }

    public lby() {
        super("mimeType", 4100000);
    }

    public lby(String str, int i) {
        super(str, i);
    }
}
