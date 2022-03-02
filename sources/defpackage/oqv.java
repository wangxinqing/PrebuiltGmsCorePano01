package defpackage;

/* renamed from: oqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum oqv implements auco {
    TOKENIZER_TEXT(0),
    TOKENIZER_HTML(1),
    TOKENIZER_RFC822_FORMATTED(2),
    TOKENIZER_URL(3),
    TOKENIZER_NONE(4),
    TOKENIZER_VERBATIM(5);
    
    public final int g;

    private oqv(int i) {
        this.g = i;
    }

    public static oqv a(int i) {
        if (i == 0) {
            return TOKENIZER_TEXT;
        }
        if (i == 1) {
            return TOKENIZER_HTML;
        }
        if (i == 2) {
            return TOKENIZER_RFC822_FORMATTED;
        }
        if (i == 3) {
            return TOKENIZER_URL;
        }
        if (i == 4) {
            return TOKENIZER_NONE;
        }
        if (i != 5) {
            return null;
        }
        return TOKENIZER_VERBATIM;
    }

    public static aucq b() {
        return oqu.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
