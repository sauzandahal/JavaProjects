<%!
    public int add(int a, int b) {
        return a + b;
    }
%>


<%
    int x = 5;
    int y = 10;
    int sum = add(x, y);
%>
The sum of <%= x %> and <%= y %> is <%= sum %>.
