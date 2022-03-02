package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aovb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovb {
    private static final Logger a = Logger.getLogger(aovb.class.getName());
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    private static final ConcurrentMap f = new ConcurrentHashMap();

    @Deprecated
    public static aoty a(String str) {
        if (str != null) {
            aoty aoty = (aoty) e.get(str.toLowerCase());
            if (aoty != null) {
                return aoty;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static aoud b(String str) {
        return c(str).a();
    }

    private static synchronized aova c(String str) {
        aova aova;
        synchronized (aovb.class) {
            if (!b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() == 0 ? new String("No key manager found for key type ") : "No key manager found for key type ".concat(valueOf));
            }
            aova = (aova) b.get(str);
        }
        return aova;
    }

    private static aova b(aoui aoui) {
        return new aoux(aoui);
    }

    public static synchronized audx b(aoyw aoyw) {
        audx b2;
        synchronized (aovb.class) {
            aoud b3 = b(aoyw.a);
            if (((Boolean) d.get(aoyw.a)).booleanValue()) {
                b2 = b3.b(aoyw.b);
            } else {
                String valueOf = String.valueOf(aoyw.a);
                throw new GeneralSecurityException(valueOf.length() == 0 ? new String("newKey-operation not permitted for key type ") : "newKey-operation not permitted for key type ".concat(valueOf));
            }
        }
        return b2;
    }

    public static aoud a(String str, Class cls) {
        aova c2 = c(str);
        if (cls == null) {
            return c2.a();
        }
        if (c2.c().contains(cls)) {
            return c2.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(c2.b());
        Set<Class> c3 = c2.c();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : c3) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = String.valueOf(name).length();
        StringBuilder sb3 = new StringBuilder(length + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static aouq a(aouj aouj, Class cls) {
        byte[] bArr;
        aovc.b(aouj.a);
        aouq aouq = new aouq(cls);
        aucx aucx = aouj.a.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aoyz aoyz = (aoyz) aucx.get(i);
            int b2 = aoyv.b(aoyz.b);
            if (b2 != 0 && b2 == 3) {
                aoyu aoyu = aoyz.a;
                if (aoyu == null) {
                    aoyu = aoyu.d;
                }
                String str = aoyu.a;
                aoyu aoyu2 = aoyz.a;
                if (aoyu2 == null) {
                    aoyu2 = aoyu.d;
                }
                Object a2 = a(str, aoyu2.b, cls);
                int b3 = aoyv.b(aoyz.b);
                if (b3 == 0 || b3 != 3) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                int b4 = aozh.b(aoyz.d);
                int i2 = 1;
                if (b4 == 0) {
                    b4 = 1;
                }
                int i3 = b4 - 2;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            bArr = aotz.a;
                        } else if (i3 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(aoyz.c).array();
                } else {
                    bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(aoyz.c).array();
                }
                int b5 = aoyv.b(aoyz.b);
                if (b5 == 0) {
                    b5 = 1;
                }
                int b6 = aozh.b(aoyz.d);
                if (b6 != 0) {
                    i2 = b6;
                }
                aoup aoup = new aoup(a2, bArr, b5, i2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(aoup);
                String str2 = new String(aoup.a(), aouq.a);
                List list = (List) aouq.b.put(str2, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(aoup);
                    aouq.b.put(str2, Collections.unmodifiableList(arrayList2));
                }
                if (aoyz.c != aouj.a.a) {
                    continue;
                } else if (aoup.b == 3) {
                    List list2 = (List) aouq.b.get(new String(aoup.a(), aouq.a));
                    if (list2 == null) {
                        list2 = Collections.emptyList();
                    }
                    if (!list2.isEmpty()) {
                        aouq.c = aoup;
                    } else {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                } else {
                    throw new IllegalArgumentException("the primary entry has to be ENABLED");
                }
            }
        }
        return aouq;
    }

    private static aouz a() {
        return new aouz();
    }

    public static synchronized aoyu a(aoyw aoyw) {
        aoyu c2;
        synchronized (aovb.class) {
            aoud b2 = b(aoyw.a);
            if (((Boolean) d.get(aoyw.a)).booleanValue()) {
                c2 = b2.c(aoyw.b);
            } else {
                String valueOf = String.valueOf(aoyw.a);
                throw new GeneralSecurityException(valueOf.length() == 0 ? new String("newKey-operation not permitted for key type ") : "newKey-operation not permitted for key type ".concat(valueOf));
            }
        }
        return c2;
    }

    public static Object a(aouq aouq) {
        aour aour = (aour) f.get(aouq.d);
        if (aour != null) {
            return aour.a(aouq);
        }
        String valueOf = String.valueOf(aouq.d.getName());
        throw new GeneralSecurityException(valueOf.length() == 0 ? new String("No wrapper found for ") : "No wrapper found for ".concat(valueOf));
    }

    private static Object a(String str, auay auay, Class cls) {
        return a(str, cls).a(auay);
    }

    public static Object a(String str, audx audx, Class cls) {
        return a(str, cls).a(audx);
    }

    public static Object a(String str, byte[] bArr, Class cls) {
        return a(str, auay.a(bArr), cls);
    }

    public static synchronized void a(aoud aoud, boolean z) {
        synchronized (aovb.class) {
            if (aoud != null) {
                String a2 = aoud.a();
                a(a2, (Class) aoud.getClass(), z);
                if (!b.containsKey(a2)) {
                    b.put(a2, new aouw(aoud));
                }
                d.put(a2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized void a(aoui aoui) {
        synchronized (aovb.class) {
            String a2 = aoui.a();
            a(a2, (Class) aoui.getClass(), true);
            if (!b.containsKey(a2)) {
                b.put(a2, b(aoui));
                c.put(a2, a());
            }
            d.put(a2, true);
        }
    }

    public static synchronized void a(aour aour) {
        synchronized (aovb.class) {
            if (aour != null) {
                Class a2 = aour.a();
                if (f.containsKey(a2)) {
                    aour aour2 = (aour) f.get(a2);
                    if (!aour.getClass().equals(aour2.getClass())) {
                        Logger logger = a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a2.toString());
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() == 0 ? new String("Attempted overwrite of a registered SetWrapper for type ") : "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a2.getName(), aour2.getClass().getName(), aour.getClass().getName()}));
                    }
                }
                f.put(a2, aour);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized void a(aout aout, aoui aoui) {
        Class d2;
        synchronized (aovb.class) {
            String a2 = aout.a();
            String a3 = aoui.a();
            a(a2, (Class) aout.getClass(), true);
            a(a3, (Class) aoui.getClass(), false);
            if (!a2.equals(a3)) {
                if (b.containsKey(a2) && (d2 = ((aova) b.get(a2)).d()) != null) {
                    if (!d2.equals(aoui.getClass())) {
                        Logger logger = a;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 96 + String.valueOf(a3).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(a2);
                        sb.append(" with inconsistent public key type ");
                        sb.append(a3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{aout.getClass().getName(), d2.getName(), aoui.getClass().getName()}));
                    }
                }
                if (!b.containsKey(a2) || ((aova) b.get(a2)).d() == null) {
                    b.put(a2, new aouy(aout, aoui));
                    c.put(a2, a());
                }
                d.put(a2, true);
                if (!b.containsKey(a3)) {
                    b.put(a3, b(aoui));
                }
                d.put(a3, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    @Deprecated
    public static void a(aoyu aoyu) {
        a(aoyu.a, aoyu.b, (Class) null);
    }

    private static synchronized void a(String str, Class cls, boolean z) {
        synchronized (aovb.class) {
            if (b.containsKey(str)) {
                aova aova = (aova) b.get(str);
                if (!aova.b().equals(cls)) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() == 0 ? new String("Attempted overwrite of a registered key manager for key type ") : "Attempted overwrite of a registered key manager for key type ".concat(valueOf));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, aova.b().getName(), cls.getName()}));
                } else if (z && !((Boolean) d.get(str)).booleanValue()) {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() == 0 ? new String("New keys are already disallowed for key type ") : "New keys are already disallowed for key type ".concat(valueOf2));
                }
            }
        }
    }
}
