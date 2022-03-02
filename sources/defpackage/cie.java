package defpackage;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.nearby.messages.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: cie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cie extends uxh implements Runnable {
    public final ArrayList a;
    public final HashSet b = new HashSet();
    final /* synthetic */ cif c;

    public cie(cif cif, ArrayList arrayList) {
        this.c = cif;
        this.a = arrayList;
    }

    public final void a(Message message) {
        cbi.k().a(new cib(this, message), bvq.a("SnapshotOperation_beaconFound"));
    }

    public final void b(Message message) {
        cbi.k().a(new cic(this, message), bvq.a("SnapshotOperation_beaconLost"));
    }

    public final void run() {
        cif cif;
        tcn.b(cbi.f()).a(this).a((acvp) new bva("[SnapshotOperation] unsubscribe beacon", new Object[0]));
        Snapshot snapshot = null;
        if (!this.b.isEmpty()) {
            Iterator it = this.b.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                ArrayList arrayList2 = this.a;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    int i2 = i + 1;
                    if (!((BeaconStateImpl.TypeFilterImpl) arrayList2.get(i)).a(message.d, message.c, message.b)) {
                        i = i2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new BeaconStateImpl.BeaconInfoImpl(message.d, message.c, message.b));
                    }
                }
            }
            cif = this.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                gro gro = new gro();
                BeaconStateImpl beaconStateImpl = new BeaconStateImpl(arrayList);
                if (!gro.a((Object) beaconStateImpl)) {
                    gro.b = beaconStateImpl;
                }
                snapshot = gro.a();
            }
        } else {
            cif = this.c;
        }
        cif.a(0, snapshot);
    }
}
