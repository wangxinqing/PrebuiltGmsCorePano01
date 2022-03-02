package com.google.android.location.fused.wearable;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmsWearableListenerChimeraService extends adze {
    private static final aijh f = new aijh();
    private static final ArrayList g = new ArrayList();

    static {
        ibq ibq = adyr.a;
    }

    public final void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        synchronized (f.a) {
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aijh aijh = f;
        printWriter.print("current capability state: ");
        synchronized (aijh.a) {
            boolean z = aijh.b;
            boolean z2 = aijh.c;
            printWriter.println("uninited");
            for (CapabilityInfoParcelable capabilityInfoParcelable : aijh.d.values()) {
                String str = capabilityInfoParcelable.a;
                String valueOf = String.valueOf(capabilityInfoParcelable.a());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(valueOf).length());
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            }
        }
    }

    public final void a(MessageEventParcelable messageEventParcelable) {
        synchronized (g) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                ((adyo) it.next()).a(messageEventParcelable);
            }
        }
    }
}
