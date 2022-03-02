package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import com.google.android.places.Subscription;
import com.google.android.places.placefencing.PlacefencingSubscription;
import java.util.List;

/* renamed from: akuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuf implements akud {
    final /* synthetic */ Context a;
    final /* synthetic */ akit b;
    final /* synthetic */ PlacefencingSubscription c;

    public akuf(PlacefencingSubscription placefencingSubscription, Context context, akit akit) {
        this.c = placefencingSubscription;
        this.a = context;
        this.b = akit;
    }

    public final void a(int i, int i2, String str, List list) {
        Intent intent = new Intent();
        iva.a((Object) intent);
        intent.putExtra("com.google.android.places.intent.extra.placefencing_status", i);
        intent.putExtra("com.google.android.places.intent.extra.placefencing_transition", i2);
        intent.putExtra("com.google.android.places.intent.extra.request_id", str);
        intent.putExtra("com.google.android.places.intent.extra.placefencing_ids", (String[]) list.toArray(new String[list.size()]));
        int i3 = Build.VERSION.SDK_INT;
        jhr.a(this.a).c("android:fine_location", this.c.c.getCreatorUid(), this.c.c.getCreatorPackage());
        try {
            int i4 = Build.VERSION.SDK_INT;
            this.c.c.send(this.a, 0, intent, (PendingIntent.OnFinished) null, (Handler) null, "android.permission.ACCESS_FINE_LOCATION");
        } catch (PendingIntent.CanceledException e) {
            ((akiy) this.b).a((Subscription) this.c);
        }
    }
}
