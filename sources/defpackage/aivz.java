package defpackage;

import android.os.Build;
import android.os.RemoteException;
import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionProvider;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

@Deprecated
/* renamed from: aivz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aivz implements ajaj {
    public static final Map b;
    public static final Map c;
    private static aiwi d = null;
    private static final List e = Arrays.asList(new String[]{"angler", "bullhead", "marlin", "sailfish", "swordfish"});
    public final ajbg a;
    private ActivityRecognitionProvider f = null;
    private final aivy g = new aivy(this);
    private boolean h = false;
    private Boolean i;
    private final aicn j;
    private final Map k = new TreeMap(ActivityTransitionRequest.a);

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("android.activity_recognition.in_vehicle", 0);
        b.put("android.activity_recognition.on_bicycle", 1);
        b.put("android.activity_recognition.still", 3);
        b.put("android.activity_recognition.tilting", 5);
        b.put("android.activity_recognition.walking", 7);
        b.put("android.activity_recognition.running", 8);
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        hashMap2.put(1, 0);
        c.put(2, 1);
    }

    public aivz(ajbg ajbg, aicn aicn) {
        this.a = ajbg;
        this.j = aicn;
    }

    public static synchronized aiwi a() {
        aiwi aiwi;
        synchronized (aivz.class) {
            if (d == null) {
                aiwi a2 = aiyk.g.a();
                d = a2;
                String valueOf = String.valueOf(a2.getClass().getName());
                if (valueOf.length() == 0) {
                    new String("create ");
                } else {
                    "create ".concat(valueOf);
                }
            }
            aiwi = d;
        }
        return aiwi;
    }

    private static final Integer b(int i2) {
        for (Map.Entry entry : c.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i2) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }

    public final void a(Boolean bool, Boolean bool2) {
    }

    public final void c() {
        if (axyr.e()) {
            this.h = false;
        } else if (axyr.b()) {
            boolean b2 = axyr.b();
            StringBuilder sb = new StringBuilder(76);
            sb.append("Ignore CHRE Disable as it is not enabled. chreArDisallowDisable flag = ");
            sb.append(b2);
            sb.toString();
        } else {
            this.j.a(aico.HARDWARE_AR_DISABLED);
            ActivityRecognitionProvider activityRecognitionProvider = this.f;
            if (activityRecognitionProvider != null) {
                if (this.h) {
                    activityRecognitionProvider.unregisterSink(this.g);
                    this.h = false;
                }
                this.k.clear();
                for (String str : b.keySet()) {
                    for (Integer intValue : c.keySet()) {
                        int intValue2 = intValue.intValue();
                        try {
                            boolean disableActivityEvent = this.f.disableActivityEvent(str, intValue2);
                            Locale locale = Locale.ENGLISH;
                            Object[] objArr = {Boolean.valueOf(disableActivityEvent), str, Integer.valueOf(intValue2)};
                        } catch (RemoteException e2) {
                        }
                    }
                }
            }
        }
    }

    public final boolean d() {
        if (!axyr.e()) {
            return this.h;
        }
        return false;
    }

    public final boolean e() {
        return true;
    }

    public final int f() {
        return -1;
    }

    public final void g() {
        if (axyr.e()) {
            return;
        }
        if (axwx.a.a().emulateHardwareActivityRecognitionFlush()) {
            this.g.onActivityChanged(new ActivityChangedEvent(Collections.emptyList()));
            return;
        }
        try {
            this.f.flush();
        } catch (RemoteException e2) {
        }
    }

    private static final String a(int i2) {
        for (Map.Entry entry : b.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i2) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    private final boolean b(ajae ajae) {
        TreeMap treeMap = new TreeMap(ActivityTransitionRequest.a);
        int[] iArr = ajaj.n;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (b.containsValue(Integer.valueOf(iArr[i2]))) {
                for (int i3 = 0; i3 <= 1; i3++) {
                    rco rco = new rco();
                    rco.a = iArr[i2];
                    rco.a(i3);
                    ActivityTransition a2 = rco.a();
                    Map map = ajae.a;
                    if (map == null || !map.containsKey(a2)) {
                        treeMap.put(a2, Integer.MAX_VALUE);
                    } else {
                        treeMap.put(a2, (Integer) ajae.a.get(a2));
                    }
                }
            }
        }
        String valueOf = String.valueOf(treeMap);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("setReportLatencyMs ");
        sb.append(valueOf);
        sb.toString();
        if (!this.h) {
            return false;
        }
        if (!this.k.equals(treeMap)) {
            this.k.keySet().removeAll(treeMap.keySet());
            if (!this.k.isEmpty()) {
                for (ActivityTransition activityTransition : this.k.keySet()) {
                    String a3 = a(activityTransition.a);
                    Integer b2 = b(activityTransition.b);
                    if (a3 == null || b2 == null) {
                        String valueOf2 = String.valueOf(activityTransition);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 56);
                        sb2.append("Ignoring transition ");
                        sb2.append(valueOf2);
                        sb2.append(" because the H/W doesn't support it.");
                        sb2.toString();
                    } else {
                        try {
                            this.f.disableActivityEvent(a3, b2.intValue());
                        } catch (RemoteException e2) {
                            c();
                            return false;
                        }
                    }
                }
            }
            this.k.clear();
            this.k.putAll(treeMap);
            for (Map.Entry entry : this.k.entrySet()) {
                try {
                    ActivityTransition activityTransition2 = (ActivityTransition) entry.getKey();
                    String a4 = a(activityTransition2.a);
                    Integer b3 = b(activityTransition2.b);
                    if (a4 != null) {
                        if (b3 != null) {
                            long intValue = ((long) ((Integer) entry.getValue()).intValue()) * 1000000;
                            boolean enableActivityEvent = this.f.enableActivityEvent(a4, b3.intValue(), intValue);
                            Locale locale = Locale.ENGLISH;
                            Object[] objArr = {Boolean.valueOf(enableActivityEvent), a4, b3, Long.valueOf(intValue)};
                            if (!enableActivityEvent) {
                                c();
                                return false;
                            }
                        }
                    }
                    String valueOf3 = String.valueOf(entry.getKey());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 56);
                    sb3.append("Ignoring transition ");
                    sb3.append(valueOf3);
                    sb3.append(" because the H/W doesn't support it.");
                    sb3.toString();
                } catch (RemoteException e3) {
                    c();
                    return false;
                }
            }
        }
        return true;
    }

    public final void a(ajad ajad) {
        if (!axyr.e()) {
            aivy aivy = this.g;
            if (!aivy.a.contains(ajad)) {
                aivy.a.add(ajad);
            }
        }
    }

    public final boolean a(ajae ajae) {
        ActivityRecognitionProvider activityRecognitionProvider;
        if (axyr.e() || (activityRecognitionProvider = this.f) == null) {
            this.h = false;
            return false;
        } else if (!this.h) {
            activityRecognitionProvider.registerSink(this.g);
            this.k.clear();
            if (b(ajae)) {
                this.j.a(aico.HARDWARE_AR_ENABLED);
                this.h = true;
                return true;
            }
            this.h = false;
            return false;
        } else {
            boolean b2 = b(ajae);
            this.h = b2;
            return b2;
        }
    }

    public final boolean b() {
        if (axyr.e()) {
            return false;
        }
        Boolean bool = this.i;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!axwl.a.a().hardwareActivityRecognitionEnabledV5() || !e.contains(Build.DEVICE)) {
            return false;
        }
        if (this.f == null) {
            ActivityRecognitionProvider b2 = a().b();
            this.f = b2;
            if (b2 == null) {
                return false;
            }
        }
        try {
            for (String str : b.keySet()) {
                if (!this.f.isActivitySupported(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
                    sb.append("Hardware AR dosen't support ");
                    sb.append(str);
                    sb.append(".");
                    sb.toString();
                    this.i = false;
                    return false;
                }
            }
            this.i = true;
            return true;
        } catch (RemoteException e2) {
            return false;
        }
    }
}
