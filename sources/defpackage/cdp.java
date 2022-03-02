package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.nearby.messages.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdp extends bwp {
    final /* synthetic */ cdu c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cdp(cdu cdu, String str) {
        super(str);
        this.c = cdu;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        HashSet hashSet = null;
        ArrayList arrayList = null;
        for (Map.Entry entry : this.c.k.entrySet()) {
            if (!((cdt) entry.getValue()).a()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((String) entry.getKey());
            }
        }
        if (arrayList != null) {
            this.c.k.keySet().removeAll(arrayList);
        }
        cdu cdu = this.c;
        for (Message message : cdu.l.keySet()) {
            if (!cdu.a(message.d, message.c, message.b)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(message);
            }
        }
        if (hashSet != null && !hashSet.isEmpty()) {
            WriteBatchImpl b = juc.b();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                jti jti = new jti((ContextData) cdu.l.remove((Message) it.next()));
                jti.a(cbi.i().a());
                b.a(jti.a());
            }
            cdu.a(b);
        }
    }
}
