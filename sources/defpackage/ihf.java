package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ihf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihf {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    public static final BasePendingResult[] b = new BasePendingResult[0];
    public final Set c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final ihe d = new ihe(this);

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult basePendingResult) {
        this.c.add(basePendingResult);
        basePendingResult.a(this.d);
    }
}
