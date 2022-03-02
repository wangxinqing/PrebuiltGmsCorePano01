package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SecondaryIdMatcher;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ryc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ryc {
    private final List a = new ArrayList();

    public final LatestFootprintFilter a() {
        return new LatestFootprintFilter(this.a);
    }

    public final void a(byte[] bArr, int i) {
        this.a.add(new SecondaryIdMatcher((byte[]) bArr.clone(), i));
    }
}
