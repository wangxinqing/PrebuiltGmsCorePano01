package defpackage;

import com.google.android.location.reporting.server.RemoteDevice;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: ajnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajnv implements Comparator {
    final /* synthetic */ Collator a;

    public ajnv(Collator collator) {
        this.a = collator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        boolean z;
        RemoteDevice remoteDevice = (RemoteDevice) obj;
        RemoteDevice remoteDevice2 = (RemoteDevice) obj2;
        boolean z2 = remoteDevice.c;
        if (z2 != remoteDevice2.c) {
            return !z2 ? -1 : 1;
        }
        Long l = remoteDevice.e;
        boolean z3 = false;
        if (l != null) {
            z = false;
        } else {
            z = true;
        }
        if (remoteDevice2.e == null) {
            z3 = true;
        }
        if (z != z3) {
            return l != null ? -1 : 1;
        }
        int compare = this.a.compare(remoteDevice.b, remoteDevice2.b);
        if (compare != 0) {
            return compare;
        }
        Long l2 = remoteDevice.e;
        if (l2 != null && !l2.equals(remoteDevice2.e)) {
            return ajnw.a(remoteDevice.e.longValue(), remoteDevice2.e.longValue());
        }
        return ajnw.a((long) remoteDevice.a, (long) remoteDevice2.a);
    }
}
