package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: agxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxn {
    public static final Logger a = Logger.getLogger(agxn.class.getName());
    static final Pattern b = Pattern.compile("[+＋]+");
    static final Pattern c = Pattern.compile("[\\\\/] *x");
    static final Pattern d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    private static final Map e;
    private static final Map f;
    private static final String g = (Arrays.toString(e.keySet().toArray()).replaceAll("[, \\[\\]]", "") + Arrays.toString(e.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
    private static final Pattern h = Pattern.compile("(\\p{Nd})");
    private static final Pattern i = Pattern.compile("[+＋\\p{Nd}]");
    private static final Pattern j = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String k = ("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + g + "\\p{Nd}]*");
    private static final String l;
    private static final Pattern m = Pattern.compile("(?:" + l + ")$", 66);
    private static final Pattern n = Pattern.compile(k + "(?:" + l + ")?", 66);
    private static final Pattern o = Pattern.compile("(\\$\\d)");
    private static agxn p = null;
    private final Map q;
    private final Set r = new HashSet(35);
    private final agxw s = new agxw();
    private final Set t = new HashSet(320);
    private final Set u = new HashSet();
    private final agxl v;
    private final agxt w = new agxt();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        e = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(e);
        hashMap4.putAll(hashMap2);
        f = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : e.keySet()) {
            char charValue2 = charValue.charValue();
            Character valueOf = Character.valueOf(Character.toLowerCase(charValue2));
            Character valueOf2 = Character.valueOf(charValue2);
            hashMap6.put(valueOf, valueOf2);
            hashMap6.put(valueOf2, valueOf2);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        sb.append(",;xｘ#＃~～");
        l = c(sb.toString());
        c("xｘ#＃~～");
    }

    public agxn(agxl agxl, Map map) {
        this.v = agxl;
        this.q = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.t.addAll(list);
            } else {
                this.u.add(entry.getKey());
            }
        }
        if (this.t.remove("001")) {
            a.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.r.addAll((Collection) map.get(1));
    }

    private final int a(CharSequence charSequence, agxp agxp) {
        return a(charSequence, agxp, 12);
    }

    static synchronized void a(agxn agxn) {
        synchronized (agxn.class) {
            p = agxn;
        }
    }

    public static String b(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    private static String c(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#";
    }

    private final int a(CharSequence charSequence, agxp agxp, int i2) {
        ArrayList arrayList;
        agxr a2 = a(agxp, i2);
        if (a2.b.isEmpty()) {
            arrayList = agxp.a.b;
        } else {
            arrayList = a2.b;
        }
        List list = a2.c;
        if (i2 == 3) {
            if (!a(a(agxp, 1))) {
                return a(charSequence, agxp, 2);
            }
            agxr a3 = a(agxp, 2);
            if (a(a3)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.addAll(a3.b.size() == 0 ? agxp.a.b : a3.b);
                Collections.sort(arrayList2);
                if (!list.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(list);
                    arrayList3.addAll(a3.c);
                    Collections.sort(arrayList3);
                    list = arrayList3;
                    arrayList = arrayList2;
                } else {
                    list = a3.c;
                    arrayList = arrayList2;
                }
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer valueOf = Integer.valueOf(length);
        if (list.contains(valueOf)) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        if (arrayList.subList(1, arrayList.size()).contains(valueOf)) {
            return 1;
        }
        return 5;
    }

    public final agxp b(String str) {
        if (!a(str)) {
            return null;
        }
        agxl agxl = this.v;
        return agxk.a(str, agxl.b, agxl.a);
    }

    public static synchronized agxn a() {
        agxn agxn;
        synchronized (agxn.class) {
            if (p == null) {
                if (agxk.a != null) {
                    a(new agxn(new agxl(), agxi.a()));
                } else {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
            }
            agxn = p;
        }
        return agxn;
    }

    private final agxp a(int i2, String str) {
        if (!"001".equals(str)) {
            return b(str);
        }
        Map map = this.q;
        Integer valueOf = Integer.valueOf(i2);
        if (!map.containsKey(valueOf)) {
            return null;
        }
        agxl agxl = this.v;
        List list = (List) agxi.a().get(valueOf);
        if (list.size() != 1 || !"001".equals(list.get(0))) {
            return null;
        }
        return agxk.a(valueOf, agxl.c, agxl.a);
    }

    static final agxr a(agxp agxp, int i2) {
        switch (i2 - 1) {
            case 0:
            case 2:
                return agxp.b;
            case 1:
                return agxp.c;
            case 3:
                return agxp.d;
            case 4:
                return agxp.e;
            case 5:
                return agxp.f;
            case 6:
                return agxp.h;
            case 7:
                return agxp.g;
            case 8:
                return agxp.i;
            case 9:
                return agxp.j;
            case 10:
                return agxp.k;
            default:
                return agxp.a;
        }
    }

    private static final void a(int i2, int i3, StringBuilder sb) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (i4 == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        }
    }

    static void a(StringBuilder sb) {
        if (j.matcher(sb).matches()) {
            int length = sb.length();
            Map map = f;
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i2 = 0; i2 < sb.length(); i2++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i2))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), b((CharSequence) sb));
    }

    private static boolean a(agxr agxr) {
        if (agxr.a() == 1 && ((Integer) agxr.b.get(0)).intValue() == -1) {
            return false;
        }
        return true;
    }

    static boolean a(CharSequence charSequence) {
        if (charSequence.length() >= 2) {
            return n.matcher(charSequence).matches();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int a(CharSequence charSequence, agxp agxp, StringBuilder sb, agxs agxs) {
        String str;
        int i2 = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (agxp == null) {
            str = "NonMatch";
        } else {
            str = agxp.m;
        }
        if (sb2.length() != 0) {
            Matcher matcher = b.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                a(sb2);
            } else {
                Pattern a2 = this.s.a(str);
                a(sb2);
                Matcher matcher2 = a2.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = h.matcher(sb2.substring(end));
                    if (!matcher3.find() || !b((CharSequence) matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() > 2) {
                if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                    int length = sb2.length();
                    int i3 = 1;
                    while (true) {
                        if (i3 > 3 || i3 > length) {
                            break;
                        }
                        int parseInt = Integer.parseInt(sb2.substring(0, i3));
                        if (this.q.containsKey(Integer.valueOf(parseInt))) {
                            sb.append(sb2.substring(i3));
                            i2 = parseInt;
                            break;
                        }
                        i3++;
                    }
                }
                if (i2 != 0) {
                    agxs.a = i2;
                    return i2;
                }
                throw new agxm(1, "Country calling code supplied was not recognised.");
            }
            throw new agxm(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (agxp != null) {
            int i4 = agxp.l;
            String valueOf = String.valueOf(i4);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                agxr agxr = agxp.a;
                a(sb4, agxp, (StringBuilder) null);
                if ((!this.w.a(sb2, agxr) && this.w.a(sb4, agxr)) || a((CharSequence) sb2, agxp) == 6) {
                    sb.append(sb4);
                    agxs.a = i4;
                    return i4;
                }
            }
        }
        agxs.a = 0;
        return 0;
    }

    public final agxs a(CharSequence charSequence, String str) {
        int i2;
        CharSequence charSequence2;
        agxs agxs = new agxs();
        if (charSequence == null) {
            throw new agxm(2, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence3 = charSequence.toString();
            int indexOf = charSequence3.indexOf(";phone-context=");
            String str2 = "";
            if (indexOf >= 0) {
                int i3 = indexOf + 15;
                if (i3 < charSequence3.length() - 1 && charSequence3.charAt(i3) == '+') {
                    int indexOf2 = charSequence3.indexOf(59, i3);
                    if (indexOf2 > 0) {
                        sb.append(charSequence3.substring(i3, indexOf2));
                    } else {
                        sb.append(charSequence3.substring(i3));
                    }
                }
                int indexOf3 = charSequence3.indexOf("tel:");
                sb.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
            } else {
                Matcher matcher = i.matcher(charSequence3);
                if (matcher.find()) {
                    charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                    Matcher matcher2 = d.matcher(charSequence2);
                    if (matcher2.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher2.start());
                    }
                    Matcher matcher3 = c.matcher(charSequence2);
                    if (matcher3.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher3.start());
                    }
                } else {
                    charSequence2 = str2;
                }
                sb.append(charSequence2);
            }
            int indexOf4 = sb.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb.delete(indexOf4, sb.length());
            }
            if (!a((CharSequence) sb)) {
                throw new agxm(2, "The string supplied did not seem to be a phone number.");
            } else if (a(str) || (sb.length() != 0 && b.matcher(sb).lookingAt())) {
                Matcher matcher4 = m.matcher(sb);
                if (matcher4.find() && a((CharSequence) sb.substring(0, matcher4.start()))) {
                    int groupCount = matcher4.groupCount();
                    int i4 = 1;
                    while (true) {
                        if (i4 > groupCount) {
                            break;
                        } else if (matcher4.group(i4) != null) {
                            str2 = matcher4.group(i4);
                            sb.delete(matcher4.start(), sb.length());
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                if (str2.length() > 0) {
                    if (str2 != null) {
                        agxs.c = true;
                        agxs.d = str2;
                    } else {
                        throw null;
                    }
                }
                agxp b2 = b(str);
                StringBuilder sb2 = new StringBuilder();
                try {
                    i2 = a(sb, b2, sb2, agxs);
                } catch (agxm e2) {
                    Matcher matcher5 = b.matcher(sb);
                    if (e2.a != 1 || !matcher5.lookingAt()) {
                        throw new agxm(e2.a, e2.getMessage());
                    }
                    i2 = a(sb.substring(matcher5.end()), b2, sb2, agxs);
                    if (i2 == 0) {
                        throw new agxm(1, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i2 == 0) {
                    a(sb);
                    sb2.append(sb);
                    if (str != null) {
                        agxs.a = b2.l;
                    }
                } else {
                    String a2 = a(i2);
                    if (!a2.equals(str)) {
                        b2 = a(i2, a2);
                    }
                }
                if (sb2.length() >= 2) {
                    if (b2 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder(sb2);
                        a(sb4, b2, sb3);
                        int a3 = a((CharSequence) sb4, b2);
                        if (!(a3 == 4 || a3 == 2 || a3 == 5)) {
                            sb2 = sb4;
                        }
                    }
                    int length = sb2.length();
                    if (length < 2) {
                        throw new agxm(4, "The string supplied is too short to be a phone number.");
                    } else if (length <= 17) {
                        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                            agxs.e = true;
                            agxs.f = true;
                            int i5 = 1;
                            while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                                i5++;
                            }
                            if (i5 != 1) {
                                agxs.g = true;
                                agxs.h = i5;
                            }
                        }
                        agxs.b = Long.parseLong(sb2.toString());
                        return agxs;
                    } else {
                        throw new agxm(5, "The string supplied is too long to be a phone number.");
                    }
                } else {
                    throw new agxm(4, "The string supplied is too short to be a phone number.");
                }
            } else {
                throw new agxm(1, "Missing or invalid default region.");
            }
        } else {
            throw new agxm(5, "The string supplied was too long to parse.");
        }
    }

    public final String a(int i2) {
        List list = (List) this.q.get(Integer.valueOf(i2));
        return list != null ? (String) list.get(0) : "ZZ";
    }

    public final String a(agxs agxs, int i2) {
        List list;
        agxo agxo;
        int i3;
        StringBuilder sb = new StringBuilder(20);
        int i4 = 0;
        sb.setLength(0);
        int i5 = agxs.a;
        StringBuilder sb2 = new StringBuilder();
        if (agxs.f && (i3 = agxs.h) > 0) {
            char[] cArr = new char[i3];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(agxs.b);
        String sb3 = sb2.toString();
        if (i2 == 1) {
            sb.append(sb3);
            a(i5, 1, sb);
        } else if (!this.q.containsKey(Integer.valueOf(i5))) {
            sb.append(sb3);
        } else {
            agxp a2 = a(i5, a(i5));
            if (a2.s.size() == 0 || i2 == 3) {
                list = a2.r;
            } else {
                list = a2.s;
            }
            int size = list.size();
            while (true) {
                if (i4 < size) {
                    agxo = (agxo) list.get(i4);
                    int a3 = agxo.a();
                    if ((a3 == 0 || this.s.a((String) agxo.c.get(a3 - 1)).matcher(sb3).lookingAt()) && this.s.a(agxo.a).matcher(sb3).matches()) {
                        break;
                    }
                    i4++;
                } else {
                    agxo = null;
                    break;
                }
            }
            if (agxo != null) {
                String str = agxo.b;
                Matcher matcher = this.s.a(agxo.a).matcher(sb3);
                String str2 = agxo.d;
                if (i2 == 3 && str2 != null && str2.length() > 0) {
                    sb3 = matcher.replaceAll(o.matcher(str).replaceFirst(str2));
                } else {
                    sb3 = matcher.replaceAll(str);
                }
            }
            sb.append(sb3);
            if (agxs.c && agxs.d.length() > 0) {
                if (a2.n) {
                    sb.append(a2.o);
                    sb.append(agxs.d);
                } else {
                    sb.append(" ext. ");
                    sb.append(agxs.d);
                }
            }
            a(i5, i2, sb);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, agxp agxp, StringBuilder sb2) {
        int length = sb.length();
        String str = agxp.p;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.s.a(str).matcher(sb);
            if (matcher.lookingAt()) {
                agxr agxr = agxp.a;
                boolean a2 = this.w.a(sb, agxr);
                int groupCount = matcher.groupCount();
                String str2 = agxp.q;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!a2 || this.w.a(sb3.toString(), agxr)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                    }
                } else if (!a2 || this.w.a(sb.substring(matcher.end()), agxr)) {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }

    public final boolean a(String str) {
        return str != null && this.t.contains(str);
    }
}
