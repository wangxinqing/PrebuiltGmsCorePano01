package defpackage;

import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: isb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class isb {
    public static WorkSource a(Collection collection) {
        WorkSource workSource = new WorkSource();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ClientIdentity clientIdentity = (ClientIdentity) it.next();
            jlr.a(workSource, clientIdentity.a, clientIdentity.b);
        }
        return workSource;
    }
}
