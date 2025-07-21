# Matris Transpozu (Matrix Transpose)

Java dilinde, kullanıcının satır ve sütun sayısını girdiği matrisin transpozunu bulan interaktif program yazınız.

## Program Açıklaması

Bu program:
1. Kullanıcıdan matrisin satır sayısını alır
2. Kullanıcıdan matrisin sütun sayısını alır
3. Kullanıcıdan matris elemanlarını tek tek girmesini ister
4. Girilen matrisin transpozunu hesaplar ve gösterir

## Matrisin Transpozu Nedir?

**Matrisin transpozunu (devrigini) almak**, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozu (devriğidir). Bu aşamada kxn'lik bir matrisin transpozu (devriği) nxk'lik bir matris olur. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2×3'lik A matrisinin transpozu (devriği), 2×3'lük bir A^T matrisidir.

### Matematiksel Örnek

```
A = [1  2  3]
    [4  5  6]

A^T = [1  4]
      [2  5]
      [3  6]
```

## Senaryo

### Örnek 1:
**Matris:**
```
2    3    4
5    6    4
```

**Transpoze:**
```
2    5
3    6
4    4
```

### Örnek 2:
**Matris:**
```
1    2    3
4    5    6
```

**Transpoze:**
```
1    4
2    5
3    6
```

## Açıklama

- **Orijinal matris boyutu:** m × n
- **Transpoze matris boyutu:** n × m
- **Dönüşüm kuralı:** `transpoze[j][i] = orijinal[i][j]`