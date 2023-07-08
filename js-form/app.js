const button = document.querySelector('.btn')

button.addEventListener('click', (e)=> {
    e.preventDefault()
    const values = [
        document.forms["myForm"]["tagline"].value,
        document.forms["myForm"]["color"].value,
        document.forms["myForm"]["size"].value,
        document.forms["myForm"]["number"].value,
        document.forms["myForm"]["payment"].value,
        document.forms['myForm']['date'].value,
        document.querySelector('#name').value,
        document.querySelector('#email').value,
        document.querySelector('#mobile').value,
        document.querySelector('#city').value,
        document.querySelector('#pincode').value,
        document.querySelector('#address').value,
        "Final price: Rs. 666"
    ];
    console.log(values)
    validateForm(values)
})

const validateForm = (values) => {
    const hasEmptyFields = Object.values(values).some(
        (item) => item === ""
    );
    let receiptBool = true
    if (hasEmptyFields) {
        alert("Please fill in all fields");
        receiptBool = false
        return;
    }
    if (!hasEmptyFields) {
        if (values[0].length > 30) {
            alert('Please enter a tagline less than 30 characters');
            receiptBool = false
        }
        if (values[3] < 1) {
            alert('You can not order less than one shirt')
            receiptBool = false
        }
        if (values[5]) {
            const date = new Date(values[5])
            const validDate = new Date > date
            if (validDate) {
                alert('Date not valid')
                receiptBool = false
            }
            
        }
        if (!values[7].indexOf('@') < -1){
            alert('Please enter a valid Email address')
            receiptBool = false
        }
        if (values[10].length < 6) {
            alert('Please enter a valid pincode')
            receiptBool = false
        }
        if (values[8].length < 10) {
            alert('Please enter a valid mobile number')
            receiptBool = false
        }
        if (receiptBool) {
            generateBill(values)
        }
    }
}

const generateBill = (values) => {
    var newWindow = window.open('', '', 'height=500, width=500');
    newWindow.document.write('<html>');
    newWindow.document.write('<body>');
    newWindow.document.write(`<style>
        p{
            text-align: center;
        }
    </style>`)
    newWindow.document.write('<h3> Receipt </h3>')
    newWindow.document.write(`${values.map((item) => {
        return `
        <p>${item}</p>`
    })}`);
    newWindow.document.write('</body></html>');
    newWindow.document.close();
    newWindow.print();
}