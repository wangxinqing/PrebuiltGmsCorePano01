package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;

/* renamed from: pnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pnl implements Runnable {
    private final Context a;
    private final oyq b;

    public pnl(Context context, oyq oyq) {
        this.a = context;
        this.b = oyq;
    }

    public final void run() {
        Context context = this.a;
        oyq oyq = this.b;
        plt a2 = plt.a(context);
        if (a2 != null) {
            a2.d();
        }
        if (pnm.a()) {
            aucd o = aoja.g.o();
            int a3 = (int) (jit.a(context, "icing_contacts.db") >> 10);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoja aoja = (aoja) o.b;
            aoja.a |= 1;
            aoja.b = a3;
            pni pni = new pni(oyq, context.getContentResolver());
            int a4 = (int) (((long) png.a(pni, ContactsContract.Contacts.CONTENT_URI)) - pnp.a(pnp.a(context).getReadableDatabase(), "contacts"));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoja aoja2 = (aoja) o.b;
            aoja2.a |= 2;
            aoja2.c = a4;
            int a5 = (int) (((long) png.a(pni, ContactsContract.CommonDataKinds.Phone.CONTENT_URI)) - pnp.a(pnp.a(context).getReadableDatabase(), "phones"));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoja aoja3 = (aoja) o.b;
            aoja3.a |= 4;
            aoja3.d = a5;
            int a6 = (int) (((long) png.a(pni, ContactsContract.CommonDataKinds.Email.CONTENT_URI)) - pnp.a(pnp.a(context).getReadableDatabase(), "emails"));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoja aoja4 = (aoja) o.b;
            aoja4.a |= 8;
            aoja4.e = a6;
            int a7 = (int) (((long) png.a(pni, ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI)) - pnp.a(pnp.a(context).getReadableDatabase(), "postals"));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoja aoja5 = (aoja) o.b;
            aoja5.a |= 16;
            aoja5.f = a7;
            aoja aoja6 = (aoja) o.i();
            long d = axrp.d();
            if (oyq.a(d)) {
                aucd aucd = (aucd) aoja6.c(5);
                aucd.a((aucj) aoja6);
                int a8 = oyq.a(aoja6.c);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoja aoja7 = (aoja) aucd.b;
                aoja7.a |= 2;
                aoja7.c = a8;
                int a9 = oyq.a(aoja6.d);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoja aoja8 = (aoja) aucd.b;
                aoja8.a |= 4;
                aoja8.d = a9;
                int a10 = oyq.a(aoja6.e);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoja aoja9 = (aoja) aucd.b;
                aoja9.a |= 8;
                aoja9.e = a10;
                int a11 = oyq.a(aoja6.f);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoja aoja10 = (aoja) aucd.b;
                aoja10.a |= 16;
                aoja10.f = a11;
                aoja aoja11 = (aoja) aucd.i();
                aucd o2 = aoji.R.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoji aoji = (aoji) o2.b;
                aoja11.getClass();
                aoji.n = aoja11;
                aoji.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                oyq.a(2003, o2, d);
            }
            context.startService(UpdateIcingCorporaIntentOperation.b(context));
        }
        poo c = poo.c(context);
        if (c != null) {
            poi.a().a(poi.a("SmsCorpusLogHealthStatsRunnable", new pom(c)));
        }
    }
}
