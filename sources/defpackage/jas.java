package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;

/* renamed from: jas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jas {
    private static final char[] f = {'u', 'l', 'l'};
    private static final char[] g = {'r', 'u', 'e'};
    private static final char[] h = {'r', 'u', 'e', '\"'};
    private static final char[] i = {'a', 'l', 's', 'e'};
    private static final char[] j = {'a', 'l', 's', 'e', '\"'};
    private static final char[] k = {10};
    private static final jar m = new jai();
    private static final jar n = new jaj();
    private static final jar o = new jak();
    private static final jar p = new jal();
    private static final jar q = new jam();
    private static final jar r = new jan();
    private static final jar s = new jao();
    private static final jar t = new jap();
    private final char[] a = new char[1];
    private final char[] b = new char[32];
    private final char[] c = new char[1024];
    private final StringBuilder d = new StringBuilder(32);
    private final StringBuilder e = new StringBuilder(1024);
    private final Stack l = new Stack();

    private final int a(BufferedReader bufferedReader, char[] cArr) {
        int i2;
        char j2 = j(bufferedReader);
        if (j2 == 0) {
            throw new jaq("Unexpected EOF");
        } else if (j2 == ',') {
            throw new jaq("Missing value");
        } else if (j2 != 'n') {
            bufferedReader.mark(1024);
            if (j2 != '\"') {
                cArr[0] = j2;
                i2 = 1;
                while (i2 < cArr.length && bufferedReader.read(cArr, i2, 1) != -1) {
                    char c2 = cArr[i2];
                    if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr[i2] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i2 - 1));
                        cArr[i2] = 0;
                        return i2;
                    }
                    i2++;
                }
            } else {
                int i3 = 0;
                boolean z = false;
                while (i2 < cArr.length && bufferedReader.read(cArr, i2, 1) != -1) {
                    char c3 = cArr[i2];
                    if (Character.isISOControl(c3)) {
                        throw new jaq("Unexpected control character while reading string");
                    } else if (c3 == '\"' && !z) {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i2 + 1));
                        return i2;
                    } else {
                        z = c3 == '\\' && !z;
                        i3 = i2 + 1;
                    }
                }
            }
            if (i2 == cArr.length) {
                throw new jaq("Absurdly long value");
            }
            throw new jaq("Unexpected EOF");
        } else {
            b(bufferedReader, f);
            return 0;
        }
    }

    private static final String b(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                for (int i2 = 0; i2 < read; i2++) {
                    char c2 = cArr[i2];
                    if (Character.isISOControl(c2)) {
                        if (cArr2 == null) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (i3 < cArr2.length) {
                            if (cArr2[i3] != c2) {
                                i3++;
                            }
                        }
                        break loop0;
                    }
                    if (c2 == '\"' && !z2) {
                        sb.append(cArr, 0, i2);
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i2 + 1));
                        if (!z) {
                            return sb.toString();
                        }
                        String sb2 = sb.toString();
                        if (TextUtils.isEmpty(sb2)) {
                            return sb2;
                        }
                        StringBuffer stringBuffer = null;
                        if (!TextUtils.isEmpty(sb2)) {
                            Matcher matcher = jln.a.matcher(sb2);
                            StringBuffer stringBuffer2 = null;
                            while (matcher.find()) {
                                if (stringBuffer2 == null) {
                                    stringBuffer2 = new StringBuffer();
                                }
                                matcher.appendReplacement(stringBuffer2, new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16))));
                            }
                            if (stringBuffer2 != null) {
                                matcher.appendTail(stringBuffer2);
                                sb2 = stringBuffer2.toString();
                            }
                        }
                        String str = sb2;
                        Matcher matcher2 = jjx.a.matcher(str);
                        while (matcher2.find()) {
                            if (stringBuffer == null) {
                                stringBuffer = new StringBuffer();
                            }
                            char charAt = matcher2.group().charAt(1);
                            if (charAt == '\"') {
                                matcher2.appendReplacement(stringBuffer, "\"");
                            } else if (charAt == '/') {
                                matcher2.appendReplacement(stringBuffer, "/");
                            } else if (charAt == '\\') {
                                matcher2.appendReplacement(stringBuffer, "\\\\");
                            } else if (charAt == 'b') {
                                matcher2.appendReplacement(stringBuffer, "\b");
                            } else if (charAt == 'f') {
                                matcher2.appendReplacement(stringBuffer, "\f");
                            } else if (charAt == 'n') {
                                matcher2.appendReplacement(stringBuffer, "\n");
                            } else if (charAt == 'r') {
                                matcher2.appendReplacement(stringBuffer, "\r");
                            } else if (charAt == 't') {
                                matcher2.appendReplacement(stringBuffer, "\t");
                            } else {
                                throw new IllegalStateException("Found an escaped character that should never be.");
                            }
                        }
                        if (stringBuffer == null) {
                            return str;
                        }
                        matcher2.appendTail(stringBuffer);
                        return stringBuffer.toString();
                    }
                    if (c2 == '\\') {
                        z2 = !z2;
                        z = true;
                    } else {
                        z2 = false;
                    }
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new jaq("Unexpected EOF while parsing string");
            }
        }
        throw new jaq("Unexpected control character while reading string");
    }

    private final String h(BufferedReader bufferedReader) {
        this.l.push(2);
        char j2 = j(bufferedReader);
        if (j2 == '\"') {
            this.l.push(3);
            String b2 = b(bufferedReader, this.b, this.d, (char[]) null);
            a(3);
            if (j(bufferedReader) == ':') {
                return b2;
            }
            throw new jaq("Expected key/value separator");
        } else if (j2 == ']') {
            a(2);
            a(1);
            a(5);
            return null;
        } else if (j2 == '}') {
            a(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(j2);
            throw new jaq(sb.toString());
        }
    }

    private final String i(BufferedReader bufferedReader) {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char j2 = j(bufferedReader);
        if (j2 != '\"') {
            if (j2 == ',') {
                throw new jaq("Missing value");
            } else if (j2 == '[') {
                this.l.push(5);
                bufferedReader2.mark(32);
                if (j(bufferedReader) == ']') {
                    a(5);
                } else {
                    bufferedReader.reset();
                    int i2 = 1;
                    boolean z = false;
                    boolean z2 = false;
                    while (i2 > 0) {
                        char j3 = j(bufferedReader);
                        if (j3 == 0) {
                            throw new jaq("Unexpected EOF while parsing array");
                        } else if (!Character.isISOControl(j3)) {
                            if (j3 == '\"' && !z) {
                                z2 = !z2;
                            }
                            if (j3 == '[' && !z2) {
                                i2++;
                            }
                            if (j3 == ']' && !z2) {
                                i2--;
                            }
                            z = j3 == '\\' && z2 && !z;
                        } else {
                            throw new jaq("Unexpected control character while reading array");
                        }
                    }
                    a(5);
                }
            } else if (j2 != '{') {
                bufferedReader.reset();
                a(bufferedReader2, this.c);
            } else {
                this.l.push(1);
                bufferedReader2.mark(32);
                char j4 = j(bufferedReader);
                if (j4 == '}') {
                    a(1);
                } else if (j4 == '\"') {
                    bufferedReader.reset();
                    h(bufferedReader);
                    do {
                    } while (i(bufferedReader) != null);
                    a(1);
                } else {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(j4);
                    throw new jaq(sb.toString());
                }
            }
        } else if (bufferedReader2.read(this.a) != -1) {
            char c2 = this.a[0];
            boolean z3 = false;
            do {
                if (c2 != '\"' || z3) {
                    if (c2 != '\\') {
                        z3 = false;
                    } else if (!z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bufferedReader2.read(this.a) != -1) {
                        c2 = this.a[0];
                    } else {
                        throw new jaq("Unexpected EOF while parsing string");
                    }
                }
            } while (!Character.isISOControl(c2));
            throw new jaq("Unexpected control character while reading string");
        } else {
            throw new jaq("Unexpected EOF while parsing string");
        }
        char j5 = j(bufferedReader);
        if (j5 == ',') {
            a(2);
            return h(bufferedReader);
        } else if (j5 == '}') {
            a(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(j5);
            throw new jaq(sb2.toString());
        }
    }

    private final char j(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.a) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.a[0])) {
            if (bufferedReader.read(this.a) == -1) {
                return 0;
            }
        }
        return this.a[0];
    }

    public final long c(BufferedReader bufferedReader) {
        long j2;
        long j3;
        int i2;
        int a2 = a(bufferedReader, this.c);
        if (a2 == 0) {
            return 0;
        }
        char[] cArr = this.c;
        if (a2 > 0) {
            int i3 = 0;
            char c2 = cArr[0];
            if (c2 == '-') {
                j2 = Long.MIN_VALUE;
            } else {
                j2 = -9223372036854775807L;
            }
            if (c2 == '-') {
                i3 = 1;
            }
            if (i3 < a2) {
                i2 = i3 + 1;
                int digit = Character.digit(cArr[i3], 10);
                if (digit >= 0) {
                    j3 = (long) (-digit);
                } else {
                    throw new jaq("Unexpected non-digit character");
                }
            } else {
                j3 = 0;
                i2 = i3;
            }
            while (i2 < a2) {
                int i4 = i2 + 1;
                int digit2 = Character.digit(cArr[i2], 10);
                if (digit2 < 0) {
                    throw new jaq("Unexpected non-digit character");
                } else if (j3 >= -922337203685477580L) {
                    long j4 = j3 * 10;
                    long j5 = (long) digit2;
                    if (j4 >= j2 + j5) {
                        j3 = j4 - j5;
                        i2 = i4;
                    } else {
                        throw new jaq("Number too large");
                    }
                } else {
                    throw new jaq("Number too large");
                }
            }
            if (i3 == 0) {
                return -j3;
            }
            if (i2 > 1) {
                return j3;
            }
            throw new jaq("No digits to parse");
        }
        throw new jaq("No number to parse");
    }

    public final BigInteger d(BufferedReader bufferedReader) {
        int a2 = a(bufferedReader, this.c);
        if (a2 != 0) {
            return new BigInteger(new String(this.c, 0, a2));
        }
        return null;
    }

    public final float e(BufferedReader bufferedReader) {
        int a2 = a(bufferedReader, this.c);
        if (a2 != 0) {
            return Float.parseFloat(new String(this.c, 0, a2));
        }
        return 0.0f;
    }

    public final double f(BufferedReader bufferedReader) {
        int a2 = a(bufferedReader, this.c);
        if (a2 != 0) {
            return Double.parseDouble(new String(this.c, 0, a2));
        }
        return 0.0d;
    }

    public final BigDecimal g(BufferedReader bufferedReader) {
        int a2 = a(bufferedReader, this.c);
        if (a2 != 0) {
            return new BigDecimal(new String(this.c, 0, a2));
        }
        return null;
    }

    private final String a(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        char j2 = j(bufferedReader);
        if (j2 == '\"') {
            return b(bufferedReader, cArr, sb, cArr2);
        }
        if (j2 == 'n') {
            b(bufferedReader, f);
            return null;
        }
        throw new jaq("Expected string");
    }

    private final ArrayList a(BufferedReader bufferedReader, FastJsonResponse$Field fastJsonResponse$Field) {
        ArrayList arrayList = new ArrayList();
        char j2 = j(bufferedReader);
        if (j2 == ']') {
            a(5);
            return arrayList;
        } else if (j2 == 'n') {
            b(bufferedReader, f);
            a(5);
            return null;
        } else if (j2 == '{') {
            this.l.push(1);
            while (true) {
                try {
                    jag c2 = fastJsonResponse$Field.c();
                    if (!a(bufferedReader, c2)) {
                        return arrayList;
                    }
                    arrayList.add(c2);
                    char j3 = j(bufferedReader);
                    if (j3 != ',') {
                        if (j3 == ']') {
                            a(5);
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(j3);
                        throw new jaq(sb.toString());
                    } else if (j(bufferedReader) == '{') {
                        this.l.push(1);
                    } else {
                        throw new jaq("Expected start of next object in array");
                    }
                } catch (InstantiationException e2) {
                    throw new jaq("Error instantiating inner object", e2);
                } catch (IllegalAccessException e3) {
                    throw new jaq("Error instantiating inner object", e3);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(j2);
            throw new jaq(sb2.toString());
        }
    }

    private final void b(BufferedReader bufferedReader, char[] cArr) {
        int i2 = 0;
        while (true) {
            int length = cArr.length;
            if (i2 < length) {
                int read = bufferedReader.read(this.b, 0, length - i2);
                if (read != -1) {
                    int i3 = 0;
                    while (i3 < read) {
                        if (cArr[i3 + i2] == this.b[i3]) {
                            i3++;
                        } else {
                            throw new jaq("Unexpected character");
                        }
                    }
                    i2 += read;
                } else {
                    throw new jaq("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    private final ArrayList a(BufferedReader bufferedReader, jar jar) {
        char j2 = j(bufferedReader);
        if (j2 == 'n') {
            b(bufferedReader, f);
            return null;
        } else if (j2 == '[') {
            this.l.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char j3 = j(bufferedReader);
                if (j3 == 0) {
                    throw new jaq("Unexpected EOF");
                } else if (j3 != ',') {
                    if (j3 != ']') {
                        bufferedReader.reset();
                        arrayList.add(jar.a(this, bufferedReader));
                    } else {
                        a(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new jaq("Expected start of array");
        }
    }

    public final int b(BufferedReader bufferedReader) {
        int i2;
        int i3;
        int i4;
        int i5;
        int a2 = a(bufferedReader, this.c);
        if (a2 == 0) {
            return 0;
        }
        char[] cArr = this.c;
        if (a2 > 0) {
            char c2 = cArr[0];
            if (c2 == '-') {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = -2147483647;
            }
            if (c2 == '-') {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 < a2) {
                i5 = i3 + 1;
                int digit = Character.digit(cArr[i3], 10);
                if (digit >= 0) {
                    i4 = -digit;
                } else {
                    throw new jaq("Unexpected non-digit character");
                }
            } else {
                i5 = i3;
                i4 = 0;
            }
            while (i5 < a2) {
                int i6 = i5 + 1;
                int digit2 = Character.digit(cArr[i5], 10);
                if (digit2 < 0) {
                    throw new jaq("Unexpected non-digit character");
                } else if (i4 >= -214748364) {
                    int i7 = i4 * 10;
                    if (i7 >= i2 + digit2) {
                        i4 = i7 - digit2;
                        i5 = i6;
                    } else {
                        throw new jaq("Number too large");
                    }
                } else {
                    throw new jaq("Number too large");
                }
            }
            if (i3 == 0) {
                return -i4;
            }
            if (i5 > 1) {
                return i4;
            }
            throw new jaq("No digits to parse");
        }
        throw new jaq("No number to parse");
    }

    private final void a(int i2) {
        if (!this.l.isEmpty()) {
            int intValue = ((Integer) this.l.pop()).intValue();
            if (intValue != i2) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Expected state ");
                sb.append(i2);
                sb.append(" but had ");
                sb.append(intValue);
                throw new jaq(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i2);
        sb2.append(" but had empty stack");
        throw new jaq(sb2.toString());
    }

    private final boolean a(BufferedReader bufferedReader, jag jag) {
        HashMap hashMap;
        BufferedReader bufferedReader2 = bufferedReader;
        jag jag2 = jag;
        Map a2 = jag.a();
        String h2 = h(bufferedReader);
        if (h2 != null) {
            while (h2 != null) {
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a2.get(h2);
                if (fastJsonResponse$Field == null) {
                    h2 = i(bufferedReader);
                } else {
                    this.l.push(4);
                    int i2 = fastJsonResponse$Field.b;
                    switch (i2) {
                        case 0:
                            if (!fastJsonResponse$Field.c) {
                                int b2 = b(bufferedReader);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, b2);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) Integer.valueOf(b2));
                                    break;
                                }
                            } else {
                                ArrayList a3 = a(bufferedReader2, m);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.c(fastJsonResponse$Field, fastJsonResponse$Field.f, a3);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a3);
                                    break;
                                }
                            }
                        case 1:
                            if (!fastJsonResponse$Field.c) {
                                BigInteger d2 = d(bufferedReader);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, d2);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) d2);
                                    break;
                                }
                            } else {
                                ArrayList a4 = a(bufferedReader2, s);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.d(fastJsonResponse$Field, fastJsonResponse$Field.f, a4);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a4);
                                    break;
                                }
                            }
                        case 2:
                            if (!fastJsonResponse$Field.c) {
                                long c2 = c(bufferedReader);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, c2);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) Long.valueOf(c2));
                                    break;
                                }
                            } else {
                                ArrayList a5 = a(bufferedReader2, n);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.e(fastJsonResponse$Field, fastJsonResponse$Field.f, a5);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a5);
                                    break;
                                }
                            }
                        case 3:
                            if (!fastJsonResponse$Field.c) {
                                float e2 = e(bufferedReader);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, e2);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) Float.valueOf(e2));
                                    break;
                                }
                            } else {
                                ArrayList a6 = a(bufferedReader2, o);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.f(fastJsonResponse$Field, fastJsonResponse$Field.f, a6);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a6);
                                    break;
                                }
                            }
                        case 4:
                            if (!fastJsonResponse$Field.c) {
                                jag2.a(fastJsonResponse$Field, f(bufferedReader));
                                break;
                            } else {
                                ArrayList a7 = a(bufferedReader2, p);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.g(fastJsonResponse$Field, fastJsonResponse$Field.f, a7);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a7);
                                    break;
                                }
                            }
                        case 5:
                            if (!fastJsonResponse$Field.c) {
                                BigDecimal g2 = g(bufferedReader);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, g2);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) g2);
                                    break;
                                }
                            } else {
                                ArrayList a8 = a(bufferedReader2, t);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.h(fastJsonResponse$Field, fastJsonResponse$Field.f, a8);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a8);
                                    break;
                                }
                            }
                        case 6:
                            if (!fastJsonResponse$Field.c) {
                                jag2.a(fastJsonResponse$Field, a(bufferedReader2, false));
                                break;
                            } else {
                                ArrayList a9 = a(bufferedReader2, q);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.i(fastJsonResponse$Field, fastJsonResponse$Field.f, a9);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a9);
                                    break;
                                }
                            }
                        case 7:
                            if (!fastJsonResponse$Field.c) {
                                String a10 = a(bufferedReader);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, a10);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a10);
                                    break;
                                }
                            } else {
                                ArrayList a11 = a(bufferedReader2, r);
                                if (fastJsonResponse$Field.k == null) {
                                    jag2.b(fastJsonResponse$Field, fastJsonResponse$Field.f, a11);
                                    break;
                                } else {
                                    jag2.a(fastJsonResponse$Field, (Object) a11);
                                    break;
                                }
                            }
                        case 8:
                            jag2.a(fastJsonResponse$Field, jhy.a(a(bufferedReader2, this.c, this.e, k)));
                            break;
                        case 9:
                            jag2.a(fastJsonResponse$Field, jhy.b(a(bufferedReader2, this.c, this.e, k)));
                            break;
                        case 10:
                            char j2 = j(bufferedReader);
                            if (j2 == 'n') {
                                b(bufferedReader2, f);
                                hashMap = null;
                            } else if (j2 == '{') {
                                this.l.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char j3 = j(bufferedReader);
                                    if (j3 == 0) {
                                        throw new jaq("Unexpected EOF");
                                    } else if (j3 == '\"') {
                                        String b3 = b(bufferedReader2, this.b, this.d, (char[]) null);
                                        if (j(bufferedReader) != ':') {
                                            String valueOf = String.valueOf(b3);
                                            throw new jaq(valueOf.length() == 0 ? new String("No map value found for key ") : "No map value found for key ".concat(valueOf));
                                        } else if (j(bufferedReader) == '\"') {
                                            hashMap.put(b3, b(bufferedReader2, this.b, this.d, (char[]) null));
                                            char j4 = j(bufferedReader);
                                            if (j4 != ',') {
                                                if (j4 == '}') {
                                                    a(1);
                                                } else {
                                                    StringBuilder sb = new StringBuilder(48);
                                                    sb.append("Unexpected character while parsing string map: ");
                                                    sb.append(j4);
                                                    throw new jaq(sb.toString());
                                                }
                                            }
                                        } else {
                                            String valueOf2 = String.valueOf(b3);
                                            throw new jaq(valueOf2.length() == 0 ? new String("Expected String value for key ") : "Expected String value for key ".concat(valueOf2));
                                        }
                                    } else if (j3 == '}') {
                                        a(1);
                                    }
                                }
                            } else {
                                throw new jaq("Expected start of a map object");
                            }
                            if (fastJsonResponse$Field.k != null) {
                                jag2.a(fastJsonResponse$Field, (Object) hashMap);
                                break;
                            } else {
                                jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, (Map) hashMap);
                                break;
                            }
                        case 11:
                            if (fastJsonResponse$Field.c) {
                                char j5 = j(bufferedReader);
                                if (j5 == 'n') {
                                    b(bufferedReader2, f);
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, (ArrayList) null);
                                    break;
                                } else {
                                    this.l.push(5);
                                    if (j5 == '[') {
                                        jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, a(bufferedReader2, fastJsonResponse$Field));
                                        break;
                                    } else {
                                        throw new jaq("Expected array start");
                                    }
                                }
                            } else {
                                char j6 = j(bufferedReader);
                                if (j6 == 'n') {
                                    b(bufferedReader2, f);
                                    jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, (jag) null);
                                    break;
                                } else {
                                    this.l.push(1);
                                    if (j6 == '{') {
                                        try {
                                            jag c3 = fastJsonResponse$Field.c();
                                            a(bufferedReader2, c3);
                                            jag2.a(fastJsonResponse$Field, fastJsonResponse$Field.f, c3);
                                            break;
                                        } catch (InstantiationException e3) {
                                            throw new jaq("Error instantiating inner object", e3);
                                        } catch (IllegalAccessException e4) {
                                            throw new jaq("Error instantiating inner object", e4);
                                        }
                                    } else {
                                        throw new jaq("Expected start of object");
                                    }
                                }
                            }
                        default:
                            StringBuilder sb2 = new StringBuilder(30);
                            sb2.append("Invalid field type ");
                            sb2.append(i2);
                            throw new jaq(sb2.toString());
                    }
                    a(4);
                    a(2);
                    char j7 = j(bufferedReader);
                    if (j7 == ',') {
                        h2 = h(bufferedReader);
                    } else if (j7 == '}') {
                        h2 = null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(55);
                        sb3.append("Expected end of object or field separator, but found: ");
                        sb3.append(j7);
                        throw new jaq(sb3.toString());
                    }
                }
            }
            a(1);
            return true;
        }
        a(1);
        return false;
    }

    public final String a(BufferedReader bufferedReader) {
        return a(bufferedReader, this.b, this.d, (char[]) null);
    }

    public final void a(InputStream inputStream, jag jag) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.l.push(0);
            char j2 = j(bufferedReader);
            if (j2 != 0) {
                if (j2 == '[') {
                    this.l.push(5);
                    Map a2 = jag.a();
                    if (a2.size() == 1) {
                        FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) ((Map.Entry) a2.entrySet().iterator().next()).getValue();
                        jag.a(fastJsonResponse$Field, fastJsonResponse$Field.f, a(bufferedReader, fastJsonResponse$Field));
                    } else {
                        throw new jaq("Object array response class must have a single Field");
                    }
                } else if (j2 == '{') {
                    this.l.push(1);
                    a(bufferedReader, jag);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(j2);
                    throw new jaq(sb.toString());
                }
                a(0);
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } else {
                throw new jaq("No data to parse");
            }
        } catch (IOException e3) {
            throw new jaq((Throwable) e3);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException e4) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    public final void a(String str, jag jag) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            a((InputStream) byteArrayInputStream, jag);
            try {
                byteArrayInputStream.close();
            } catch (IOException e2) {
                Log.w("FastParser", "Failed to close the input stream while parsing.");
            }
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (IOException e3) {
                Log.w("FastParser", "Failed to close the input stream while parsing.");
            }
            throw th;
        }
    }

    public final boolean a(BufferedReader bufferedReader, boolean z) {
        char[] cArr;
        char[] cArr2;
        char j2 = j(bufferedReader);
        if (j2 != '\"') {
            if (j2 == 'f') {
                if (!z) {
                    cArr = i;
                } else {
                    cArr = j;
                }
                b(bufferedReader, cArr);
                return false;
            } else if (j2 == 'n') {
                b(bufferedReader, f);
                return false;
            } else if (j2 == 't') {
                if (!z) {
                    cArr2 = g;
                } else {
                    cArr2 = h;
                }
                b(bufferedReader, cArr2);
                return true;
            } else {
                StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(j2);
                throw new jaq(sb.toString());
            }
        } else if (!z) {
            return a(bufferedReader, true);
        } else {
            throw new jaq("No boolean value found in string");
        }
    }
}
