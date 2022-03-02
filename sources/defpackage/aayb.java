package defpackage;

import android.os.Bundle;

/* renamed from: aayb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayb {
    public final Bundle a;

    public aayb(Bundle bundle) {
        this.a = bundle;
    }

    /* access modifiers changed from: package-private */
    public final long a(String str, long j) {
        long j2 = this.a.getLong(str.length() == 0 ? new String("snet_") : "snet_".concat(str));
        return j2 == 0 ? this.a.getLong(str, j) : j2;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        if (!this.a.getBoolean(str.length() == 0 ? new String("snet_") : "snet_".concat(str))) {
            return this.a.getBoolean(str);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final byte[] c(String str) {
        byte[] byteArray = this.a.getByteArray(str.length() == 0 ? new String("snet_") : "snet_".concat(str));
        return byteArray == null ? this.a.getByteArray(str) : byteArray;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        String string = this.a.getString(str.length() == 0 ? new String("snet_") : "snet_".concat(str));
        return string == null ? this.a.getString(str) : string;
    }
}
