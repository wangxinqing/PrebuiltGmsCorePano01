package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: vce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vce extends bhw implements vcf {
    private final ige a;

    public vce() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    public final void a(MessageWrapper messageWrapper) {
    }

    public final void b(MessageWrapper messageWrapper) {
    }

    public static void a(Intent intent, uxh uxh) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        a(bundleExtra != null ? bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES") : Collections.emptyList(), uxh);
    }

    public vce(ige ige) {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
        this.a = ige;
    }

    public static void a(Iterable iterable, uxh uxh) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Update update = (Update) it.next();
            uxh.a(update);
            if (update.a(1)) {
                uxh.a(update.c);
            }
            if (update.a(2)) {
                uxh.b(update.c);
            }
            if (update.a(4)) {
                Message message = update.c;
                DistanceImpl distanceImpl = update.d;
            }
            if (update.a(8)) {
                uxh.a(update.c, update.e);
            }
            if (update.a(16)) {
                uxh.a(update.c, update.f);
            }
        }
    }

    public final void a(List list) {
        this.a.a(new vdz(list));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            MessageWrapper messageWrapper = (MessageWrapper) bhx.a(parcel, MessageWrapper.CREATOR);
        } else if (i == 2) {
            MessageWrapper messageWrapper2 = (MessageWrapper) bhx.a(parcel, MessageWrapper.CREATOR);
        } else if (i != 4) {
            return false;
        } else {
            a((List) parcel.createTypedArrayList(Update.CREATOR));
        }
        return true;
    }
}
