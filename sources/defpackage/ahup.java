package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ahup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ahup {
    WIFI(1, "WiFi", false, 0, 0),
    CELL(2, "cell", false, 0, 0),
    ORIENTATION(4, "orientation", true, 3, 1),
    ACCELEROMETER(8, "accelerometer", true, 3, 1),
    GYROSCOPE(16, "gyroscope", true, 3, 1),
    MAGNETIC_FIELD(32, "magnetic field", true, 3, 1),
    GPS(64, "gps", false, 0, 0),
    GPS_SATELLITE(128, "gps satellite", false, 0, 0),
    BAROMETER(PSKKeyManager.MAX_KEY_LENGTH_BYTES, "barometer", true, 1, 1),
    UNCAL_MAGNETIC_FIELD(512, "uncal magnetic field", true, 6, 1),
    LIGHT(1024, "light", true, 1, 2),
    PROXIMITY(2048, "proximity", true, 1, 2),
    SOUND(FragmentTransaction.TRANSIT_ENTER_MASK, "sound", true, 113, 0),
    HEART_RATE(FragmentTransaction.TRANSIT_EXIT_MASK, "heart rate", true, 1, 2),
    STEP_COUNTER(16384, "step counter", true, 1, 2),
    DEVICE_STATE(32768, "device state", false, 0, 0),
    GNSS_MEASUREMENTS(65536, "gnss measurements", false, 0, 0),
    GNSS_NAVIGATION_MESSAGE(131072, "gnss navigation message", false, 0, 0),
    BLUETOOTH_DEVICE(262144, "bluetooth device", false, 0, 0),
    WIFI_RTT(524288, "wifi rtt ranging", false, 0, 0),
    HEART_PPG(1048576, "heart ppg", true, 4, 1),
    RAW_AUDIO(2097152, "raw audio", true, 0, 0),
    UNKNOWN(Integer.MIN_VALUE, "unknown", false, 0, 0);
    
    public static final Set C = null;
    public final int A;
    public final int B;
    public final int x;
    public final boolean y;
    public final String z;

    static {
        ahup ahup;
        ahup ahup2;
        ahup ahup3;
        ahup ahup4;
        ahup ahup5;
        ahup ahup6;
        ahup ahup7;
        ahup ahup8;
        ahup ahup9;
        ahup ahup10;
        ahup ahup11;
        ahup ahup12;
        ahup ahup13;
        ahup ahup14;
        ahup ahup15;
        ahup ahup16;
        ahup ahup17;
        ahup ahup18;
        ahup ahup19;
        ahup ahup20;
        ahup ahup21;
        ahup ahup22;
        C = Collections.unmodifiableSet(EnumSet.of(ahup, new ahup[]{ahup2, ahup3, ahup4, ahup5, ahup6, ahup7, ahup8, ahup9, ahup10, ahup11, ahup12, ahup13, ahup14, ahup15, ahup16, ahup17, ahup18, ahup19, ahup20, ahup21, ahup22}));
        Collections.unmodifiableSet(EnumSet.of(ORIENTATION, new ahup[]{ACCELEROMETER, GYROSCOPE, MAGNETIC_FIELD, BAROMETER, UNCAL_MAGNETIC_FIELD, LIGHT, PROXIMITY, HEART_RATE, STEP_COUNTER, HEART_PPG}));
    }

    private ahup(int i, String str, boolean z2, int i2, int i3) {
        this.x = i;
        this.z = str;
        this.y = z2;
        this.A = i2;
        this.B = i3;
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((ahup) it.next()).x;
        }
        return i;
    }

    public final String toString() {
        return String.valueOf(this.x);
    }

    public static Set a(int i) {
        EnumSet<E> noneOf = EnumSet.noneOf(ahup.class);
        for (ahup ahup : C) {
            if ((ahup.x & i) != 0) {
                noneOf.add(ahup);
            }
        }
        return noneOf;
    }

    public static Set a(ahup... ahupArr) {
        return EnumSet.copyOf(Arrays.asList(ahupArr));
    }
}
