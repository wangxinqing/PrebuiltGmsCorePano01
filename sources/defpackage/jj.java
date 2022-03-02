package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: jj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jj implements ja {
    public final Notification.Builder a;
    public final je b;
    public RemoteViews c;
    public final Bundle d = new Bundle();
    public RemoteViews e;

    public jj(je jeVar) {
        String str;
        int i;
        Bundle bundle;
        String str2;
        Bundle[] bundleArr;
        Notification.Action.Builder builder;
        Bundle bundle2;
        int i2;
        Icon icon;
        je jeVar2 = jeVar;
        new ArrayList();
        this.b = jeVar2;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(jeVar2.a, jeVar2.z);
        } else {
            this.a = new Notification.Builder(jeVar2.a);
        }
        Notification notification = jeVar2.C;
        Icon icon2 = null;
        int i3 = 0;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(jeVar2.d).setContentText(jeVar2.e).setContentInfo((CharSequence) null).setContentIntent(jeVar2.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(jeVar2.g, (notification.flags & 128) != 0).setLargeIcon(jeVar2.h).setNumber(jeVar2.i).setProgress(jeVar2.n, jeVar2.o, jeVar2.p);
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        this.a.setSubText(jeVar2.m).setUsesChronometer(false).setPriority(jeVar2.j);
        ArrayList arrayList = jeVar2.b;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i6 >= size) {
                break;
            }
            jc jcVar = (jc) arrayList.get(i6);
            int i7 = Build.VERSION.SDK_INT;
            IconCompat a2 = jcVar.a();
            if (Build.VERSION.SDK_INT >= 23) {
                if (a2 != null) {
                    icon = a2.e();
                } else {
                    icon = icon2;
                }
                builder = new Notification.Action.Builder(icon, jcVar.f, jcVar.g);
            } else {
                if (a2 != null) {
                    i2 = a2.c();
                } else {
                    i2 = 0;
                }
                builder = new Notification.Action.Builder(i2, jcVar.f, jcVar.g);
            }
            js[] jsVarArr = jcVar.b;
            if (jsVarArr != null) {
                int length = jsVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                while (i3 < jsVarArr.length) {
                    js jsVar = jsVarArr[i3];
                    RemoteInput.Builder label = new RemoteInput.Builder(jsVar.a).setLabel(jsVar.b);
                    CharSequence[] charSequenceArr = jsVar.c;
                    RemoteInput.Builder choices = label.setChoices((CharSequence[]) null);
                    boolean z = jsVar.d;
                    RemoteInput.Builder addExtras = choices.setAllowFreeFormInput(true).addExtras(jsVar.e);
                    if (Build.VERSION.SDK_INT >= 29) {
                        addExtras.setEditChoicesBeforeSending(0);
                    }
                    remoteInputArr[i3] = addExtras.build();
                    i3++;
                }
                for (int i8 = 0; i8 < length; i8++) {
                    builder.addRemoteInput(remoteInputArr[i8]);
                }
            }
            Bundle bundle3 = jcVar.a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean(str, jcVar.c);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(jcVar.c);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", jcVar.d);
            builder.addExtras(bundle2);
            this.a.addAction(builder.build());
            i6++;
            icon2 = null;
            i3 = 0;
        }
        Bundle bundle4 = jeVar2.t;
        if (bundle4 != null) {
            this.d.putAll(bundle4);
        }
        int i9 = Build.VERSION.SDK_INT;
        this.c = jeVar2.x;
        int i10 = Build.VERSION.SDK_INT;
        this.a.setShowWhen(jeVar2.k);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = Build.VERSION.SDK_INT;
        this.a.setLocalOnly(jeVar2.r).setGroup(jeVar2.q).setGroupSummary(false).setSortKey((String) null);
        int i13 = Build.VERSION.SDK_INT;
        this.a.setCategory(jeVar2.s).setColor(jeVar2.u).setVisibility(jeVar2.v).setPublicVersion(jeVar2.w).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = jeVar2.D;
        int size2 = arrayList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            this.a.addPerson((String) arrayList2.get(i14));
        }
        this.e = jeVar2.y;
        if (jeVar2.c.size() > 0) {
            Bundle bundle5 = jeVar.a().getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle();
            int i15 = 0;
            while (i15 < jeVar2.c.size()) {
                String num = Integer.toString(i15);
                jc jcVar2 = (jc) jeVar2.c.get(i15);
                Bundle bundle7 = new Bundle();
                IconCompat a3 = jcVar2.a();
                if (a3 != null) {
                    i = a3.c();
                } else {
                    i = 0;
                }
                bundle7.putInt("icon", i);
                bundle7.putCharSequence("title", jcVar2.f);
                bundle7.putParcelable("actionIntent", jcVar2.g);
                Bundle bundle8 = jcVar2.a;
                if (bundle8 != null) {
                    bundle = new Bundle(bundle8);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, jcVar2.c);
                bundle7.putBundle("extras", bundle);
                js[] jsVarArr2 = jcVar2.b;
                if (jsVarArr2 != null) {
                    bundleArr = new Bundle[jsVarArr2.length];
                    int i16 = 0;
                    while (i16 < jsVarArr2.length) {
                        js jsVar2 = jsVarArr2[i16];
                        Bundle bundle9 = new Bundle();
                        String str3 = str;
                        js[] jsVarArr3 = jsVarArr2;
                        bundle9.putString("resultKey", jsVar2.a);
                        bundle9.putCharSequence("label", jsVar2.b);
                        CharSequence[] charSequenceArr2 = jsVar2.c;
                        bundle9.putCharSequenceArray("choices", (CharSequence[]) null);
                        boolean z2 = jsVar2.d;
                        bundle9.putBoolean("allowFreeFormInput", true);
                        bundle9.putBundle("extras", jsVar2.e);
                        Set<String> set = jsVar2.f;
                        if (!set.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(set.size());
                            for (String add : set) {
                                arrayList3.add(add);
                            }
                            bundle9.putStringArrayList("allowedDataTypes", arrayList3);
                        }
                        bundleArr[i16] = bundle9;
                        i16++;
                        str = str3;
                        jsVarArr2 = jsVarArr3;
                    }
                    str2 = str;
                } else {
                    str2 = str;
                    bundleArr = null;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", jcVar2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i15++;
                str = str2;
            }
            bundle5.putBundle("invisible_actions", bundle6);
            jeVar.a().putBundle("android.car.EXTENSIONS", bundle5);
            this.d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(jeVar2.t).setRemoteInputHistory((CharSequence[]) null);
            RemoteViews remoteViews = jeVar2.x;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = jeVar2.y;
            if (remoteViews2 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews2);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(0).setShortcutId((String) null).setTimeoutAfter(jeVar2.A).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(jeVar2.z)) {
                this.a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(jeVar2.B);
            this.a.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
    }
}
