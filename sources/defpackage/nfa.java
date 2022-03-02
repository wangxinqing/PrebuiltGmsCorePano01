package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: nfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfa {
    public final Collection a = new ArrayList();

    public nfa() {
        new ArrayList();
        new ArrayList();
    }

    public static void a(Context context) {
        nfb nfb = nfg.a().a;
        synchronized (nfb) {
            if (!nfb.a) {
                try {
                    nfb.b = nfe.asInterface(mcx.a(context, mcx.c, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                    nfb.b.init(mbz.a((Object) context));
                    nfb.a = true;
                } catch (RemoteException | mct e) {
                    Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
                }
            }
        }
    }
}
