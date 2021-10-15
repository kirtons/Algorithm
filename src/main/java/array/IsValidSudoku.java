package array;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/15 14:38
 * @description：有效的数独
 * 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 *
 * 注意：
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 */
public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int len = board.length;
        boolean row[][] = new boolean[len][len];
        boolean column[][] = new boolean[len][len];
        boolean cell[][] = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == '.')
                    continue;
                // 因为数独中最大数字为9，而数组定义中范围为0-8，故此处减一
                int num = board[i][j] - '0' - 1;
                int sequence = i / 3 * 3 + j / 3;
                if (row[i][num] || column[j][num] || cell[sequence][num])
                    return false;
                row[i][num] = column[j][num] = cell[sequence][num] = true;
            }
        }
        return true;
    }

}
