package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: actx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actx {
    public static final Set a;
    public static final Map b;
    private static final Pattern c = Pattern.compile(aznk.a.a().g());
    private static final anax d = anax.a("system_app_strictmode", "system_server_anr", "data_app_wtf", "system_app_native_crash", "system_app_wtf", "system_app_anr", "data_app_anr", "data_app_crash", "data_app_native_crash", "data_app_strictmode", "system_app_crash");

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("clearcut_dropbox_upload_realtime_data_app_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_data_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_app_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_data_app_anr");
        hashSet.add("clearcut_dropbox_upload_realtime_system_app_anr");
        hashSet.add("clearcut_dropbox_upload_realtime_SYSTEM_CRASH_REPORT");
        hashSet.add("clearcut_dropbox_upload_realtime_SYSTEM_LAST_KMSG");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_anr");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_native_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_watchdog");
        hashSet.add("clearcut_dropbox_upload_data_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_data_app_wtf");
        hashSet.add("clearcut_dropbox_upload_system_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_system_app_wtf");
        hashSet.add("clearcut_dropbox_upload_system_server_lowmem");
        hashSet.add("clearcut_dropbox_upload_system_server_wtf");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_anr");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_anr");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_SYSTEM_CRASH_REPORT");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_SYSTEM_LAST_KMSG");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_anr");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_native_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_watchdog");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_wtf");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_wtf");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_lowmem");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_wtf");
        a = hashSet;
        HashMap hashMap = new HashMap();
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_native_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_native_crash", 102400);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_anr", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_anr", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_SYSTEM_CRASH_REPORT", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_SYSTEM_LAST_KMSG", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_anr", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_native_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_watchdog", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_strictmode", 10240);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_wtf", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_strictmode", 10240);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_wtf", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_lowmem", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_wtf", 102400);
        hashMap.put("clearcut_dropbox_upload_qos_tier_data_app_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_data_app_native_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_app_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_app_native_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_data_app_anr", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_app_anr", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_SYSTEM_CRASH_REPORT", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_SYSTEM_LAST_KMSG", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_anr", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_crash", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_native_crash", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_watchdog", 0);
        b = hashMap;
    }

    private static int a(SharedPreferences sharedPreferences, String str, int i, hph hph) {
        if (aznk.c() && sharedPreferences != null) {
            try {
                return (int) sharedPreferences.getLong(str, aznk.a.a().b());
            } catch (ClassCastException e) {
                hph.c("DropboxClassCastException").a();
            }
        }
        return b.containsKey(str) ? ((Integer) b.get(str)).intValue() : i;
    }

    public static avsd a(avwc avwc, hph hph) {
        SharedPreferences sharedPreferences;
        aucx aucx = avwc.i;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            avwa avwa = (avwa) aucx.get(i);
            if (azpd.b()) {
                sharedPreferences = ihs.b().getSharedPreferences("com.google.android.metrics", 0);
            } else {
                sharedPreferences = null;
            }
            String valueOf = String.valueOf(avwa.b);
            if (avsd.a(a(sharedPreferences, valueOf.length() == 0 ? new String("clearcut_dropbox_upload_qos_tier_") : "clearcut_dropbox_upload_qos_tier_".concat(valueOf), 0, hph)) == avsd.FAST_IF_RADIO_AWAKE) {
                if (jkr.c()) {
                    String str = new String(avwa.c.k());
                    if (azpd.b()) {
                        String valueOf2 = String.valueOf(avwa.b);
                        if (a(sharedPreferences, valueOf2.length() == 0 ? new String("clearcut_dropbox_background_allowed_") : "clearcut_dropbox_background_allowed_".concat(valueOf2), hph)) {
                            return avsd.FAST_IF_RADIO_AWAKE;
                        }
                    }
                    if (!str.contains("Foreground: Yes\n")) {
                        if (!azpd.b()) {
                            return avsd.DEFAULT;
                        }
                    }
                }
                return avsd.FAST_IF_RADIO_AWAKE;
            }
        }
        return avsd.DEFAULT;
    }

    static boolean a(SharedPreferences sharedPreferences, String str, hph hph) {
        if (aznk.c() && sharedPreferences != null) {
            try {
                boolean z = sharedPreferences.getBoolean(str, false);
                if (!z || !str.endsWith("SYSTEM_TOMBSTONE") || jkr.h()) {
                    return z;
                }
                return false;
            } catch (ClassCastException e) {
                hph.c("DropboxClassCastException").a();
            }
        }
        return a.contains(str);
    }

    public static avwa[] a(Context context, SharedPreferences sharedPreferences, DropBoxManager dropBoxManager, String str, long j, long j2, boolean z, hph hph) {
        DropBoxManager.Entry nextEntry;
        String str2;
        InputStream inputStream;
        int i;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String str3 = str;
        hph hph2 = hph;
        Pattern compile = Pattern.compile(aznk.a.a().d());
        ArrayList arrayList = new ArrayList();
        long j3 = j;
        while (j3 < j2 && (nextEntry = dropBoxManager.getNextEntry((String) null, j3)) != null) {
            String tag = nextEntry.getTag();
            long timeMillis = nextEntry.getTimeMillis();
            if (str3.equals("DropboxRealtime")) {
                String valueOf = String.valueOf(tag);
                str2 = valueOf.length() == 0 ? new String("clearcut_dropbox_upload_realtime_") : "clearcut_dropbox_upload_realtime_".concat(valueOf);
            } else if (str3.equals("Dropbox")) {
                String valueOf2 = String.valueOf(tag);
                str2 = valueOf2.length() == 0 ? new String("clearcut_dropbox_upload_") : "clearcut_dropbox_upload_".concat(valueOf2);
            } else {
                String valueOf3 = String.valueOf(tag);
                str2 = valueOf3.length() == 0 ? new String("clearcut_dropbox_upload_strip_logcat_") : "clearcut_dropbox_upload_strip_logcat_".concat(valueOf3);
            }
            if (a(sharedPreferences2, str2, hph2)) {
                aucd o = avwa.j.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avwa avwa = (avwa) o.b;
                tag.getClass();
                int i2 = avwa.a | 1;
                avwa.a = i2;
                avwa.b = tag;
                avwa.a = i2 | 4;
                avwa.d = timeMillis;
                try {
                    String valueOf4 = String.valueOf(tag);
                    int a2 = a(sharedPreferences2, valueOf4.length() == 0 ? new String("clearcut_dropbox_upload_max_bytes_") : "clearcut_dropbox_upload_max_bytes_".concat(valueOf4), 196608, hph2);
                    inputStream = nextEntry.getInputStream();
                    if (inputStream != null) {
                        byte[] bArr = new byte[a2];
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i3 >= 0) {
                                i = i4 + i3;
                                if (i >= a2) {
                                    break;
                                }
                                i3 = inputStream.read(bArr, i, a2 - i);
                                DropBoxManager dropBoxManager2 = dropBoxManager;
                                i4 = i;
                            } else {
                                i = i4;
                                break;
                            }
                        }
                        if (i < a2) {
                            bArr = Arrays.copyOf(bArr, i);
                        }
                        inputStream.close();
                        auay a3 = auay.a(bArr);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avwa avwa2 = (avwa) o.b;
                        a3.getClass();
                        avwa2.a |= 2;
                        avwa2.c = a3;
                        String valueOf5 = String.valueOf(tag);
                        if (a(sharedPreferences2, valueOf5.length() == 0 ? new String("clearcut_dropbox_upload_strip_logcat_") : "clearcut_dropbox_upload_strip_logcat_".concat(valueOf5), hph2)) {
                            String str4 = new String(((avwa) o.b).c.k());
                            Matcher matcher = compile.matcher(str4);
                            if (matcher.find()) {
                                auay a4 = auay.a(str4.substring(0, matcher.start()).getBytes());
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avwa avwa3 = (avwa) o.b;
                                a4.getClass();
                                int i5 = avwa3.a | 2;
                                avwa3.a = i5;
                                avwa3.c = a4;
                                avwa3.a = i5 | 8;
                                avwa3.e = true;
                            }
                        }
                        if (d.contains(tag)) {
                            try {
                                Matcher matcher2 = c.matcher(new String(((avwa) o.b).c.k()));
                                if (matcher2.find()) {
                                    String group = matcher2.group(1);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avwa avwa4 = (avwa) o.b;
                                    group.getClass();
                                    avwa4.a |= 16;
                                    avwa4.f = group;
                                    int parseInt = Integer.parseInt(matcher2.group(2));
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avwa avwa5 = (avwa) o.b;
                                    avwa5.a |= 32;
                                    avwa5.g = parseInt;
                                    String group2 = matcher2.group(3);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avwa avwa6 = (avwa) o.b;
                                    group2.getClass();
                                    avwa6.a |= 64;
                                    avwa6.h = group2;
                                    String installerPackageName = context.getPackageManager().getInstallerPackageName(((avwa) o.b).f);
                                    if (installerPackageName != null) {
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        avwa avwa7 = (avwa) o.b;
                                        installerPackageName.getClass();
                                        avwa7.a |= 128;
                                        avwa7.i = installerPackageName;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                Log.e(str3, e.getMessage(), e);
                            }
                        }
                        if (!z) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            avwa avwa8 = (avwa) o.b;
                            avwa8.a &= -3;
                            avwa8.c = avwa.j.c;
                        }
                        arrayList.add((avwa) o.i());
                    } else {
                        throw new IOException("null InputStream");
                    }
                } catch (IOException e2) {
                    Log.e(str3, e2.getMessage(), e2);
                } catch (Throwable th) {
                    inputStream.close();
                    throw th;
                }
            }
            nextEntry.close();
            j3 = timeMillis;
        }
        return (avwa[]) arrayList.toArray(new avwa[arrayList.size()]);
    }
}
