package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

/* renamed from: kyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyr extends kyl implements kyu, kyt {
    public kyr(String str, boolean[] zArr) {
        super(str, 4100000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        bundle.putLong(this.a, ((Date) obj).getTime());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return new Date(bundle.getLong(this.a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return new Date(dataHolder.a(this.a, i, i2));
    }

    public kyr(String str) {
        super(str, 4100000);
    }

    public kyr(String str, byte[] bArr) {
        super(str, 8000000);
    }

    public kyr(String str, char[] cArr) {
        super(str, 4100000);
    }

    public kyr(String str, int[] iArr) {
        super(str, 4100000);
    }

    public kyr(String str, short[] sArr) {
        super(str, 4300000);
    }
}
