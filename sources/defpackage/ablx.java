package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: ablx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablx extends AsyncTaskLoader {
    private List a;
    private final ClientContext b;
    private final abmn c = new abmm(new iyn(getContext(), azid.a.a().c(), azid.a.a().b(), false, true, (String) null, (String) null));
    private final avik d;

    public ablx(Context context, ClientContext clientContext, avik avik) {
        super(context);
        this.b = clientContext;
        this.d = avik;
    }

    /* renamed from: a */
    public final void deliverResult(List list) {
        this.a = list;
        if (isStarted()) {
            super.deliverResult(list);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        avil avil;
        try {
            abmn abmn = this.c;
            avik avik = this.d;
            ClientContext clientContext = this.b;
            aucf aucf = (aucf) amdv.a.o();
            aucf.a(abmm.a, avik);
            amdv amdv = (amdv) aucf.i();
            aucd o = amdu.e.o();
            int a2 = abmm.a.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amdu amdu = (amdu) o.b;
            int i = amdu.a | 1;
            amdu.a = i;
            amdu.b = a2;
            amdv.getClass();
            amdu.c = amdv;
            amdu.a = i | 2;
            amdu amdu2 = (amdu) o.i();
            aucd o2 = amdq.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            amdq amdq = (amdq) o2.b;
            amdu2.getClass();
            if (!amdq.a.a()) {
                amdq.a = aucj.a(amdq.a);
            }
            amdq.a.add(amdu2);
            amdr amdr = (amdr) ((abmm) abmn).b.a(clientContext, 1, "/batchfetch?alt=proto", ((amdq) o2.i()).k(), (Object) amdr.b);
            if (amdr.a.size() > 0) {
                aucd o3 = amdx.d.o();
                amdw amdw = ((amdx) amdr.a.get(0)).b;
                if (amdw == null) {
                    amdw = amdw.b;
                }
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                amdx amdx = (amdx) o3.b;
                amdw.getClass();
                amdx.b = amdw;
                amdx.a |= 1;
                amdx amdx2 = (amdx) o3.i();
                if ((amdx2.a & 2) != 0) {
                    Object[] objArr = new Object[1];
                    atip atip = amdx2.c;
                    if (atip == null) {
                        atip = atip.c;
                    }
                    objArr[0] = atip.b;
                    Log.w("DataMixerServer", String.format("Server error fetching cards data: %s", objArr));
                    avil = null;
                } else {
                    amdw amdw2 = amdx2.b;
                    if (amdw2 == null) {
                        amdw2 = amdw.b;
                    }
                    auci auci = avil.c;
                    amdw2.a(auci);
                    Object b2 = amdw2.m.b(auci.d);
                    if (b2 == null) {
                        b2 = auci.b;
                    } else {
                        auci.a(b2);
                    }
                    avil = (avil) b2;
                }
            } else {
                avil = null;
            }
            if (avil != null) {
                return avil.a;
            }
            return amzy.h();
        } catch (eif e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Auth exception fetching server cards: ");
            sb.append(valueOf);
            Log.w("DataMixerLoader", sb.toString());
            return null;
        } catch (VolleyError e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("Volley error fetching server cards: ");
            sb2.append(valueOf2);
            Log.w("DataMixerLoader", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.a = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        List list = this.a;
        if (list != null) {
            deliverResult(list);
        }
        if (takeContentChanged() || this.a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
