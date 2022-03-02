package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: azyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azyb {
    static final azyc a;

    static {
        azyc azyc;
        AtomicReference atomicReference = new AtomicReference();
        try {
            azyc = (azyc) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(azyc.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            azyc = new babr();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = azyc;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            azyd.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
