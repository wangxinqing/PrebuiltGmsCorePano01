package defpackage;

import android.location.Location;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: aifn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aifn implements aiex {
    final /* synthetic */ aifo a;

    public aifn(aifo aifo) {
        this.a = aifo;
    }

    public final Location a(boolean z) {
        aifo aifo = this.a;
        return !aifo.d ? aifo.a.a(z) : aifo.e;
    }

    public final void a(aiew aiew) {
        this.a.f = aiew;
    }

    public final void b() {
        aifo aifo = this.a;
        if (aifo.c) {
            aifo.c = false;
            if (!aifo.d) {
                aifo.a.b();
            }
        }
    }

    public final void a() {
        aifo aifo = this.a;
        if (!aifo.c) {
            aifo.c = true;
            if (!aifo.d) {
                aifo.a.a();
            }
        }
    }

    public final void a(aido aido) {
        aifo aifo = this.a;
        if (!aifo.d) {
            aifo.a.a(aido);
        } else if (aido != null) {
            aido.a();
        }
    }

    public final void a(Location location, int i) {
        this.a.a.a(location, i);
    }

    public final void a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.a.a(fileDescriptor, printWriter, strArr);
    }

    public final void a(Collection collection, boolean z) {
        this.a.a.a(collection, z);
    }
}
