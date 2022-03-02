package com.google.android.gms.smartdevice.d2d.ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ForwardingChimeraActivity extends bjs {
    private static final acpz a = acqa.a("ForwardingChimeraActivity");
    private ResultReceiver b;
    private Queue c;
    private Intent d;

    public static PendingIntent a(Context context, ResultReceiver resultReceiver, PendingIntent pendingIntent) {
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
        intent.putExtra("pendingIntent", pendingIntent);
        intent.putExtra("resultReceiver", a(resultReceiver));
        return PendingIntent.getActivity(context.getApplicationContext(), 2, intent, 134217728);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            this.b.send(-1, (Bundle) null);
            finish();
            return;
        }
        Intent intent2 = (Intent) this.c.poll();
        if (intent2 == null) {
            this.b.send(-1, (Bundle) null);
            finish();
            return;
        }
        Intent intent3 = this.d;
        if (intent3 != null) {
            intent2.fillIn(intent3, 0);
        }
        startActivityForResult(intent2, 1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (azlo.b()) {
            Intent intent2 = new Intent();
            this.d = intent2;
            alht.a(intent, intent2);
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver == null) {
            a.d("No receiver", new Object[0]);
            finish();
            return;
        }
        this.b = resultReceiver;
        if (bundle == null) {
            arrayList = intent.getParcelableArrayListExtra("intents");
        } else {
            arrayList = bundle.getParcelableArrayList("intents");
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pendingIntent");
        if (pendingIntent == null) {
            if (arrayList == null) {
                a.d("No intents given", new Object[0]);
                finish();
                return;
            }
            ArrayDeque arrayDeque = new ArrayDeque(arrayList);
            this.c = arrayDeque;
            if (bundle == null) {
                Intent intent3 = (Intent) arrayDeque.poll();
                if (intent3 == null) {
                    a.d("No intents to forward", new Object[0]);
                    finish();
                    return;
                }
                Intent intent4 = this.d;
                if (intent4 != null) {
                    intent3.fillIn(intent4, 0);
                }
                startActivityForResult(intent3, 1);
            }
        } else if (bundle == null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 2, this.d, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                a.e("Failed sending intent", e, new Object[0]);
                this.b.send(2, (Bundle) null);
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Queue queue = this.c;
        if (queue != null) {
            bundle.putParcelableArrayList("intents", new ArrayList(queue));
        }
    }

    public final void finish() {
        int i = Build.VERSION.SDK_INT;
        finishAndRemoveTask();
    }

    public static PendingIntent a(Context context, ResultReceiver resultReceiver, ArrayList arrayList) {
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
        intent.putParcelableArrayListExtra("intents", arrayList);
        intent.putExtra("resultReceiver", a(resultReceiver));
        return PendingIntent.getActivity(context.getApplicationContext(), 1, intent, 134217728);
    }

    private static ResultReceiver a(ResultReceiver resultReceiver) {
        if (!azlo.b()) {
            return resultReceiver;
        }
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
