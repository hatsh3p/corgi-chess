package Pieces;

/**
 * Chess consists of the following 6 pieces with the respective count:
 *      (1) Pawn x8
 *      (2) Rook x2
 *      (3) Knight x2
 *      (4) Bishop x2
 *      (5) Queen x1
 *      (6) King x1
 *
 * In Java, an enum extends the Object and is a special type of class.
 * All enums extend Enum. They are essentially constants with special features:
 *      - Can be compared using ==
 *      - They are type-safe - a variable of type Type can only hold one of the
 *      defined values.
 *      - Reusable - Reduces code duplication.
 *      - Encapsulated - The values of an enum are hidden, unlike constants.
 */
public enum Type {
    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
}