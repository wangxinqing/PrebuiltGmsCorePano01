package defpackage;

import java.util.Arrays;

/* renamed from: btr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btr {
    private static atnh a = null;
    private static atnh b = null;

    public static synchronized atnh a() {
        atnh atnh;
        synchronized (btr.class) {
            try {
                if (a == null) {
                    atng atng = (atng) atnh.d.o();
                    if (atng.c) {
                        atng.c();
                        atng.c = false;
                    }
                    atnh atnh2 = (atnh) atng.b;
                    atnh2.a |= 1;
                    atnh2.c = 0;
                    atng.a(Arrays.asList(new atow[]{bth.a(atjv.AUDIO_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.DAY_ATTRIBUTES, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.DETECTED_ACTIVITY, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.DETECTED_BEACON, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.EXPERIMENTAL1_UPLOAD_RESTRICTED, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_WRITE, (String) null)), bth.a(atjv.EXPERIMENTAL2_UPLOAD_OK, atqx.SYNCABLE_TO_BACKEND, bth.a(3, atnd.READ_WRITE, (String) null)), bth.a(atjv.EXPERIMENTAL3_UPLOAD_OK, atqx.SYNCABLE_TO_BACKEND, bth.a(3, atnd.READ_WRITE, (String) null)), bth.a(atjv.INSTALLED_APPS, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.LOCALE_BASED_TIME_MODEL, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.SUN_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.TIME_PROPERTY, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.NETWORK_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PERSONALIZED_PLACES, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.apps.location.samples.places"), bth.a(2, atnd.READ_ONLY, "com.google.android.apps.location.samples.odlh"), bth.a(2, atnd.READ_ONLY, "com.google.android.gms.apitest")), bth.a(atjv.PHONE_CALL, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PHONE_LOCK, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PLACES, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.READ_ONLY, "com.google.android.as"), bth.a(2, atnd.READ_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.READ_ONLY, "com.google.android.katniss"), bth.a(2, atnd.READ_ONLY, "com.google.android.music")), bth.a(atjv.POWER_CONNECTION, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PROXIMITY_DISTANCE, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.RUNNING_APPS, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.SAFE_LOCATION_MODEL, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_WRITE, "com.google.android.apps.sesame"), bth.a(2, atnd.READ_WRITE, "com.google.android.apps.miphone.unlock")), bth.a(atjv.SCREEN, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.SNAPPED_TO_ROAD_LOCATION, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_WRITE, (String) null)), bth.a(atjv.TRUST_DECISION, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.apps.sesame"), bth.a(2, atnd.READ_WRITE, "com.google.android.apps.miphone.unlock"), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.TRUST_SIGNAL, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.apps.sesame"), bth.a(2, atnd.READ_WRITE, "com.google.android.apps.miphone.unlock"), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.UDC_FOOTPRINTS_SETTINGS_MODEL, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_WRITE, "com.google.android.gms.apitest")), bth.a(atjv.USER_LOCATION, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.USER_VELOCITY, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.READ_ONLY, "com.google.android.carassistant")), bth.a(atjv.WEATHER, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.READ_ONLY, "com.google.pixel.livewallpaper"), bth.a(2, atnd.READ_ONLY, "com.google.android.apps.tv.dreamx"), bth.a(2, atnd.READ_ONLY, "com.google.android.pokemonwallpaper"), bth.a(2, atnd.READ_ONLY, "com.google.android.googlequicksearchbox")), bth.a(atjv.WEATHER_INTERNAL, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.WIFI_SCAN, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.XGEO_HEADER, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty")), bth.a(atjv.INDOOR_OUTDOOR, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty")), bth.a(atjv.DND_MODE, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_ONLY, "com.google.android.apps.wellbeing"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty")), bth.a(atjv.MAPS_NAVIGATION_STATE, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.WRITE_ONLY, "com.google.android.apps.gmm.dev"), bth.a(2, atnd.WRITE_ONLY, "com.google.android.apps.gmm.fishfood"), bth.a(2, atnd.WRITE_ONLY, "com.google.android.apps.gmm"), bth.a(2, atnd.WRITE_ONLY, "com.google.android.apps.gmm.qp"), bth.a(2, atnd.WRITE_ONLY, "com.google.android.apps.maps"), bth.a(2, atnd.READ_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.READ_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.READ_ONLY, "com.google.android.carassistant"))}));
                    a = (atnh) atng.i();
                }
                atnh = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return atnh;
    }

    public static synchronized atnh b() {
        atnh atnh;
        synchronized (btr.class) {
            if (b == null) {
                atng atng = (atng) atnh.d.o();
                if (atng.c) {
                    atng.c();
                    atng.c = false;
                }
                atnh atnh2 = (atnh) atng.b;
                atnh2.a |= 1;
                atnh2.c = 0;
                atng.a(Arrays.asList(new atow[]{bth.a(atjv.AUDIO_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_ONLY, "com.google.android.as"), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.DAY_ATTRIBUTES, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.DETECTED_ACTIVITY, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_ONLY, "com.google.android.as"), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.DETECTED_BEACON, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.EXPERIMENTAL1_UPLOAD_RESTRICTED, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.EXPERIMENTAL2_UPLOAD_OK, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.EXPERIMENTAL3_UPLOAD_OK, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms")), bth.a(atjv.FENCE_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.READ_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.INSTALLED_APPS, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.LOCALE_BASED_TIME_MODEL, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.SUN_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.TIME_PROPERTY, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.NETWORK_STATE, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PHONE_CALL, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PHONE_LOCK, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PLACES, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.as"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.katniss"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.music")), bth.a(atjv.POWER_CONNECTION, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.PROXIMITY_DISTANCE, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.RUNNING_APPS, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_ONLY, "com.google.android.as"), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.SCREEN, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_WRITE, "com.google.android.gms")), bth.a(atjv.TRUST_DECISION, atqx.DO_NOT_SYNC, bth.a(2, atnd.READ_WRITE, "com.google.android.gms"), bth.a(2, atnd.READ_WRITE, "com.google.android.apps.sesame"), bth.a(2, atnd.READ_WRITE, "com.google.android.apps.miphone.unlock")), bth.a(atjv.USER_LOCATION, atqx.DO_NOT_SYNC, bth.a(3, atnd.LISTEN_ONLY, (String) null), bth.a(2, atnd.READ_ONLY, "com.google.android.as"), bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms")), bth.a(atjv.USER_VELOCITY, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.carassistant")), bth.a(atjv.WEATHER, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.LISTEN_ONLY, "com.google.pixel.livewallpaper"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.apps.tv.dreamx"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.pokemonwallpaper"), bth.a(2, atnd.LISTEN_ONLY, "com.samsung.android.mateagent"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.googlequicksearchbox")), bth.a(atjv.WEATHER_INTERNAL, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms")), bth.a(atjv.XGEO_HEADER, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.googlequicksearchbox"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.gmscore.awareness.firstparty")), bth.a(atjv.INDOOR_OUTDOOR, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.gmscore.awareness.firstparty"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.apps.car.carapp")), bth.a(atjv.DND_MODE, atqx.DO_NOT_SYNC, bth.a(2, atnd.LISTEN_INJECT, "com.google.android.gms"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.apps.wellbeing"), bth.a(2, atnd.LISTEN_ONLY, "com.google.android.gmscore.awareness.firstparty"))}));
                b = (atnh) atng.i();
            }
            atnh = b;
        }
        return atnh;
    }
}
