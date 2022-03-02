package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* renamed from: lbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lbj extends kyl implements kyt {
    public lbj(String str, byte[] bArr) {
        super(str, 4100000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        bundle.putBoolean(this.a, ((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(this.a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean c(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.d(this.a, i, i2));
    }

    public lbj(String str) {
        super(str, 4100000);
    }

    public lbj(String str, int i) {
        super(str, i);
    }

    public lbj(String str, Collection collection, Collection collection2) {
        super(str, collection, collection2, 7000000);
    }
}
