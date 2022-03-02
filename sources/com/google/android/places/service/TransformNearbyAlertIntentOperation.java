package com.google.android.places.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.userlocation.UserLocationNearbyLikelihood;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TransformNearbyAlertIntentOperation extends IntentOperation {
    public TransformNearbyAlertIntentOperation() {
        this(new akxf(), new akva());
    }

    private final void a(Intent intent) {
        advb advb;
        advb advb2;
        PendingIntent pendingIntent;
        String str;
        List list;
        int i;
        List<PlaceLikelihoodEntity> list2;
        Bundle bundle;
        Intent intent2 = intent;
        if (intent2 != null) {
            advb = advb.a(intent2.getIntExtra("com.google.android.userlocation.extra.nearby_status", 8), ivy.b(intent2, "com.google.android.userlocation.extra.nearby_likelihoods", UserLocationNearbyLikelihood.CREATOR), intent2.getIntExtra("com.google.android.userlocation.extra.nearby_transition", 0));
        } else {
            advb = null;
        }
        String str2 = "Places";
        if (advb != null) {
            PendingIntent pendingIntent2 = (PendingIntent) intent2.getParcelableExtra("com.google.android.gms.userlocation.UserLocationNearbyAlertResult.LEGACY_CALL_INTENT_EXTRA");
            if (pendingIntent2 != null) {
                Intent intent3 = new Intent();
                if (intent2.hasExtra("nearby_alert_debug_data")) {
                    intent3.putExtras(intent2.getBundleExtra("nearby_alert_debug_data"));
                }
                int i2 = advb.c;
                int i3 = i2 != 1 ? i2 != 2 ? i2 != 4 ? -1 : 104 : 103 : 102;
                if (i3 != -1) {
                    int i4 = advb.a;
                    List list3 = advb.b;
                    if (list3 == null) {
                        list2 = Collections.emptyList();
                        advb2 = advb;
                        i = i4;
                    } else {
                        ArrayList arrayList = new ArrayList(list3.size());
                        int size = list3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            UserLocationNearbyLikelihood userLocationNearbyLikelihood = (UserLocationNearbyLikelihood) list3.get(i5);
                            arrayList.add(PlaceLikelihoodEntity.a(akhp.a(userLocationNearbyLikelihood.a, userLocationNearbyLikelihood.b, userLocationNearbyLikelihood.c, userLocationNearbyLikelihood.d), 1.0f));
                            i5++;
                            advb = advb;
                            i4 = i4;
                        }
                        advb2 = advb;
                        i = i4;
                        list2 = arrayList;
                    }
                    ilm a = DataHolder.a(rks.b);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (list2 != null) {
                        for (PlaceLikelihoodEntity placeLikelihoodEntity : list2) {
                            a.a(placeLikelihoodEntity.c());
                            linkedHashSet.addAll(placeLikelihoodEntity.a.n);
                        }
                    }
                    String a2 = rjd.a(linkedHashSet);
                    if (!TextUtils.isEmpty(a2)) {
                        bundle = new Bundle();
                        ria.a(bundle, a2);
                    } else {
                        bundle = null;
                    }
                    rhj rhj = new rhj(a.a(i, bundle), false, i3);
                    rhj.a(intent3);
                    rhj.c();
                } else {
                    advb2 = advb;
                }
                advb advb3 = advb2;
                int i6 = advb3.a;
                List list4 = advb3.b;
                if (list4 == null) {
                    list = Collections.emptyList();
                    str = str2;
                    pendingIntent = pendingIntent2;
                } else {
                    ArrayList arrayList2 = new ArrayList(list4.size());
                    int size2 = list4.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        UserLocationNearbyLikelihood userLocationNearbyLikelihood2 = (UserLocationNearbyLikelihood) list4.get(i7);
                        arrayList2.add(NearbyLikelihoodEntity.a(akhp.a(userLocationNearbyLikelihood2.a, userLocationNearbyLikelihood2.b, userLocationNearbyLikelihood2.c, userLocationNearbyLikelihood2.d), 1.0f));
                        i7++;
                        str2 = str2;
                        pendingIntent2 = pendingIntent2;
                    }
                    str = str2;
                    pendingIntent = pendingIntent2;
                    list = arrayList2;
                }
                rhn rhn = new rhn(i6, list, advb3.c);
                ArrayList arrayList3 = new ArrayList(rhn.a());
                Iterator it = rhn.iterator();
                long j = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    rhm rhm = (rhm) ((rhm) it.next()).r();
                    if (rhm instanceof NearbyLikelihoodEntity) {
                        NearbyLikelihoodEntity nearbyLikelihoodEntity = (NearbyLikelihoodEntity) rhm;
                        j += (long) ivy.a(nearbyLikelihoodEntity).length;
                        if (j <= 400000) {
                            arrayList3.add(nearbyLikelihoodEntity);
                        } else if (Log.isLoggable("NearbyLikelihoodBuffer", 5)) {
                            Log.w("NearbyLikelihoodBuffer", String.format("Reached Binder size limit. Returned %d of %d results", new Object[]{Integer.valueOf(arrayList3.size()), Integer.valueOf(rhn.a())}));
                        }
                    }
                }
                ivy.a((Iterable) arrayList3, intent3, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.PLACE_LIST_EXTRA_KEY");
                ivy.a((SafeParcelable) rhn.c, intent3, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.STATUS_EXTRA_KEY");
                intent3.putExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.TRANSITION_EXTRA_KEY", rhn.b);
                rhn.c();
                PendingIntent pendingIntent3 = pendingIntent;
                try {
                    akva.a(this, intent3, pendingIntent3);
                } catch (PendingIntent.CanceledException e) {
                    PendingIntent.CanceledException canceledException = e;
                    String str3 = str;
                    if (Log.isLoggable(str3, 5)) {
                        String valueOf = String.valueOf(canceledException.getMessage());
                        Log.w(str3, valueOf.length() == 0 ? new String("CanceledException when sending intent: ") : "CanceledException when sending intent: ".concat(valueOf));
                    }
                    akxf.a(this, "com.google.android.gms", (String) null).b(pendingIntent3);
                }
            } else if (Log.isLoggable(str2, 5)) {
                Log.w(str2, "Received intent has no PendingIntent to use - ignoring it");
            }
        } else {
            String str4 = str2;
            if (Log.isLoggable(str4, 5)) {
                Log.w(str4, "Received intent has no result to use - ignoring it");
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.places.service.ACTION_NEARBY_ALERT_EVENT".equals(intent.getAction())) {
            a(intent);
        } else if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("Places", valueOf.length() == 0 ? new String("Unable to handle intent with action ") : "Unable to handle intent with action ".concat(valueOf));
        }
    }

    public TransformNearbyAlertIntentOperation(akxf akxf, akva akva) {
    }
}
