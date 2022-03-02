package defpackage;

import android.os.RemoteException;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: bwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwf {
    public static void a(jxf jxf, int i) {
        try {
            jxf.a(new Status(i));
        } catch (RemoteException e) {
            anih anih = (anih) bxk.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("bwf", "a", 34, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return status to client.");
        }
    }

    public static void b(jxf jxf, int i, DataHolder dataHolder) {
        try {
            jxf.a(new Status(i), dataHolder);
        } catch (RemoteException e) {
            anih anih = (anih) bxk.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("bwf", "b", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return read result to client.");
        }
    }

    public static void a(jxf jxf, int i, Snapshot snapshot) {
        try {
            jxf.a(new Status(i), snapshot);
        } catch (RemoteException e) {
            anih anih = (anih) bxk.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("bwf", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return snapshot result to client.");
        }
    }

    public static void a(jxf jxf, int i, DataHolder dataHolder) {
        try {
            jxf.b(new Status(i), dataHolder);
        } catch (RemoteException e) {
            anih anih = (anih) bxk.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("bwf", "a", 51, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return read result to client.");
        }
    }

    public static void a(jxf jxf, int i, FenceStateImpl fenceStateImpl) {
        try {
            jxf.a(new Status(i), fenceStateImpl);
        } catch (RemoteException e) {
            ((anih) ((anih) bxk.a.c()).a("bwf", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return fence evaluate result to client.");
        }
    }

    public static void a(jxf jxf, int i, FenceStateMapImpl fenceStateMapImpl) {
        try {
            jxf.a(new Status(i), fenceStateMapImpl);
        } catch (RemoteException e) {
            anih anih = (anih) bxk.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("bwf", "a", 116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return fence state query result to client.");
        }
    }

    public static void a(jxf jxf, int i, WriteBatchImpl writeBatchImpl) {
        try {
            jxf.a(new Status(i), writeBatchImpl);
        } catch (RemoteException e) {
            anih anih = (anih) bxk.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("bwf", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Callbacks] Can't return write batch result to client.");
        }
    }
}
