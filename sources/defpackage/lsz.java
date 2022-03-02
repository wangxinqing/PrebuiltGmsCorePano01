package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.drivingmode.DrivingModeLocationSetupNotificationIntentOperation;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;

/* renamed from: lsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lsz extends IntentOperation {
    private lts a;

    private static final Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(lto.a());
        return intent;
    }

    public final void onCreate() {
        lww.a();
        lww.a(getApplicationContext());
        lww.a();
        this.a = lww.e(getApplicationContext());
    }

    public void onHandleIntent(Intent intent) {
        lsw lsw;
        anxt anxt;
        int i;
        int i2;
        int i3;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Received callback intent! ");
        sb.append(valueOf);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (awqd.c() && "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION".equals(intent.getAction()) && ActivityTransitionResult.a(intent)) {
            if (ActivityTransitionResult.a(intent)) {
                ActivityTransitionResult b = ActivityTransitionResult.b(intent);
                if (awqd.e()) {
                    i = intent.getIntExtra("AR_AUDIO_FUSION_RESULT", -1);
                } else {
                    i = -1;
                }
                Log.i("CAR.DRIVINGMODE", String.format("handling ActivityTransitionResult: result = %s; carResult = %d", new Object[]{b, Integer.valueOf(i)}));
                if (i == 0) {
                    i2 = 2;
                } else {
                    i2 = (i != 1 || !awqd.g()) ? 1 : 3;
                }
                if (!awqd.e() || !awqd.g()) {
                    amrl.a(!b.a.isEmpty(), (Object) "Transition result is empty");
                    ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) anbs.d(b.a);
                    if (!awqd.b() || activityTransitionEvent.a != 3) {
                        if (awqy.a.a().j() && (((i3 = activityTransitionEvent.a) == 8 || i3 == 7) && activityTransitionEvent.b == 0)) {
                            Log.i("CAR.DRIVINGMODE", String.format("Received walking/running entry transition. Exiting vehicle %s", new Object[]{b}));
                            lsw = lsw.a(3);
                        } else if (i2 != 1) {
                            String a2 = lsx.a(i2);
                            StringBuilder sb2 = new StringBuilder(a2.length() + 50);
                            sb2.append("Received car fusion result with transition type = ");
                            sb2.append(a2);
                            Log.i("CAR.DRIVINGMODE", sb2.toString());
                            lsw = lsw.b(i2);
                        } else if (activityTransitionEvent.a != 0) {
                            Log.i("CAR.DRIVINGMODE", String.format("Insignificant non vehicle related transition result = %s", new Object[]{b}));
                            lsw = lsw.a(1);
                        } else {
                            int i4 = activityTransitionEvent.b;
                            if (i4 == 0) {
                                lsw = lsw.a(2);
                            } else if (i4 != 1) {
                                lsw = lsw.a(1);
                            } else {
                                lsw = lsw.a(3);
                            }
                        }
                    } else if (activityTransitionEvent.b != 0) {
                        lsw = lsw.a(5);
                    } else {
                        lsw = lsw.a(4);
                    }
                } else {
                    lsw = lsw.b(i2);
                }
            } else {
                lsw = lsw.a(1);
            }
            String valueOf2 = String.valueOf(lsw);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb3.append("Handling transition ");
            sb3.append(valueOf2);
            Log.i("CAR.DRIVINGMODE", sb3.toString());
            int i5 = lsw.b - 1;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            return;
                        }
                    }
                }
                if (!lsw.a) {
                    anxt = anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECTED;
                } else {
                    anxt = anxt.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_DISCONNECTED;
                }
                this.a.a(anxu.DRIVING_MODE, anxt);
                startService(a("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END"));
                startService(IntentOperation.getStartIntent(getApplicationContext(), DrivingModeLocationSetupNotificationIntentOperation.class, "com.google.android.drivingmode.SEND_SETUP_NOTIFICATION"));
                return;
            }
            this.a.a(anxu.DRIVING_MODE, !lsw.a ? anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_CONNECTED : anxt.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_CONNECTED);
            startService(a("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START"));
        }
    }
}
